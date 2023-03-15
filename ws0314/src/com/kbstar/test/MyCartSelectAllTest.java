package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {

	public static void main(String[] args) {
		ShopService<Cust, Cart> service = new ShopServiceImpl();

		List<Cart> list = null;
		try {
			list = service.myCart("알파코직원");
			if (list.size() == 0) {
				System.out.println("데이터가 없네요");
			} else {
				for (Cart obj : list) {
					System.out.println(obj);
				}
			}
			System.out.println("등록된 ITEM의 갯수는 " + list.size() + "개 입니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}