package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();

		try {
			cart = Service.get("2023314241100");
			System.out.println(cart);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}