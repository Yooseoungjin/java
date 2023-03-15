package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TrDTO;
import com.kbstar.dto.CustDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceimpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<CustDTO, AccountDTO, TrDTO, String, String> service = null;
		service = new BankServiceimpl();
				
		// Register
		CustDTO user = new CustDTO("id01", "pwd01", "name","111");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Login
		String id = "id01";
		String pwd = "pwd01";
		CustDTO loginUser = null; //로그인 정상일때 받을 준비
		try {
			loginUser = service.login(id, pwd);
			System.out.println(loginUser);
//			System.out.println("Login OK~~~~~~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
