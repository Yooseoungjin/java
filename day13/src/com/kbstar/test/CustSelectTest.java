package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
		
		try {
		crudService.get("id01");
//		System.out.println("성공");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}