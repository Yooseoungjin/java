package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.AccountService;

public class AccountRegisterTest {
	public static void main(String args[]) {
		CRUDService<String, AccountDTO> service = new AccountService();

//		계좌개설
//		AccountDTO obj = new AccountDTO(MakeAccountNumber.makeAccNum(), 30000, "id99");
//		try {
//			service.register(obj);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}

		// get(k) test ------------------------------------
//		AccountDTO Account = null;
//		try {
//			Account = service.get("2023315200100");
//			System.out.println(Account);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// get() test ------------------------------------
//		List<AccountDTO> acclist = null;
//
//		try {
//			acclist = service.get();
//			System.out.println("여기가 오류?");
//	
//			for (AccountDTO u : acclist) {
//				System.out.println(u);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// remove() test ------------------------------------
		
		try {
			service.remove("2023315291100");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}