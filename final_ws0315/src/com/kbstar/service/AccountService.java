package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{

	DAO<String, AccountDTO> accDao;
	Notification notification;
	
	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}
	
	@Override
	public void register(AccountDTO v) throws Exception {
		try{
			accDao.insert(v);
			System.out.println("계좌가 개설되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("계좌개설에 실패 하였습니다.(ER0001:계좌번호중복)");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		accDao.delete(k);
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		accDao.update(v);
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		obj = accDao.select(k);
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		list = accDao.select();
		return list;
	}

}
