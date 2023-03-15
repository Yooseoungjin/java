package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.CustDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustService;

public class UserRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, CustDTO> service = new CustService();
		CustDTO obj = new CustDTO("id01", "pwd01", "james", "010-9999-0292");
		CustDTO obj2 = new CustDTO("id02", "pwd02", "james", "010-9999-0292");
		CustDTO obj3 = new CustDTO("id03", "pwd03", "james", "010-9999-0292");

		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// get(k) test ------------------------------------
		CustDTO user = null;
		try {
			user = service.get("id01");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// get() test ------------------------------------
		// Emp e = new Manager();
		// List list = new ArrayList();

		List<CustDTO> list = null;

		try {
			list = service.get();
			for (CustDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// remove() test ------------------------------------
		try {
			service.remove("id05");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}