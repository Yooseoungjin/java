package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * 
 * @author YOO SEUNG JIN
 *
 */

public class BankServiceimpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> TransactionDao;
	Notification notification;

	public BankServiceimpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		notification = new NotificationImpl();
		TransactionDao = new TransactionDAO();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록오류");
		}
		notification.sendSMS(v.getContact(), "진심으로 축하합니다...");
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		if (user != null) {
			if (user.getPwd().equals(p)) {
				System.out.println("로그인 되었슈~");
			} else {
				throw new Exception("비번확인해 봐유~");
			}
		} else {
			throw new Exception("없는 아이디에유~");
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		accountDao.insert(account);
		UserDTO user = userDao.select(k);
		notification.sendSMS(user.getContact(), accNo + "계좌를 생성 하였습니다.");
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		return TransactionDao.search(acc);
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금융결제원 전송..");
		// 계좌 정보 수정
		// 계좌 잔액 정보를 조회하고 잔액에서 이체하는 금액을 차감한 잔액으로 수정
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc); // 내 계좌의 정보를 가져와라
		double abalance = acc.getBalance() - balance;
		acc.setBalance(abalance); // 송금후 잔액인 abalance를 계좌정보에 넣어라
		accountDao.update(acc);
		// 거래 내역 추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc);
		TransactionDao.insert(tr);
		System.out.println();

		// sms 전송
		String uid = acc.getHolder_id();
		UserDTO u = userDao.select(uid);
		notification.sendSMS(u.getContact(),
				acc.getAccNo() + " 에서 " + balance +
				" 출금 되었다. " + " 이체 후 잔액은 " + acc.getBalance());
		// 완료
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = null;
		list = accountDao.search(k);
		return list;
		//세줄 -> 한줄 표기법 return accountDao.search(k);		
	}

}
