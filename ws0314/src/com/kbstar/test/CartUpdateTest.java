package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {
	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		Cart cart = new Cart("2023314241100", 999);
		try {
			service.modify(cart);
			System.out.println("장바구니 수정 성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}