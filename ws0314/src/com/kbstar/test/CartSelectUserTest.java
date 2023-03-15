package com.kbstar.test;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectUserTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		List<Cart> list = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("회원ID를 입력하세요");
		String user_id = sc.next();

		try {
			list = service.getUserSelection(user_id);
			if (list.size() == 0) {
				System.out.println("데이터가 없네요");
			} else {
				for (Cart obj : list) {
					System.out.println(obj);
				}
				//list 출력후 리스트 사이즈 출력
				System.out.println("장바구니의 ITEM의 갯수는 " + list.size() + "개 입니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}