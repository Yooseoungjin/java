package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class AccountDAO implements DAO<String, AccountDTO> {

	HashMap<String, AccountDTO> db;

	public AccountDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
	}

	@Override
	public void insert(AccountDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.accinsertSql);) {
			pstmt.setString(1, v.getAccNo());
			pstmt.setDouble(2, v.getBalance());
			pstmt.setString(3, v.getHolder_id());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.accdeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if (result == 0) {
				System.out.println(k + "는 없는 계좌번호입니다.");
			} else {
				System.out.println("계좌가 삭제 되었습니다");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void update(AccountDTO v) throws Exception {

	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO acc = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.accselectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String accNo = rset.getString("accNo");
				Double balance = rset.getDouble("balance");
				Date regdate = rset.getDate("regdate");
				String holder_id = rset.getString("holder_id");

				acc = new AccountDTO(accNo, balance, regdate, holder_id);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return acc;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		List<AccountDTO> acclist = new ArrayList<AccountDTO>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.accselectAllSql);) {

			try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					AccountDTO acc = null;
					String accNO = rset.getString("accNO");
					Double balance = rset.getDouble("balance");
					Date regdate = rset.getDate("regdate");
					String holder_id = rset.getString("holder_id");
					acc = new AccountDTO(accNO, balance, regdate, holder_id);
					acclist.add(acc);
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {
			throw e;
		}
		return acclist;
	}

	// 사용자의 계좌 조회
	// obj : 사용자의 id;
	// Object obj = new String();
	@Override

	public List<AccountDTO> search(Object obj) throws Exception {

		List<AccountDTO> list = new ArrayList<AccountDTO>();
		try (Connection con = getConnection(); 
				PreparedStatement pstmt 
				= con.prepareStatement(Sql.myaccselectAllSql);) {
			
			pstmt.setObject(1, obj);
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					AccountDTO acc = null;
					String accNO = rset.getString("accNO");
					Double balance = rset.getDouble("balance");
					Date regdate = rset.getDate("regdate");
					String holder_id = rset.getString("holder_id");
					acc = new AccountDTO(accNO, balance, regdate, holder_id);
					list.add(acc);
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}
}