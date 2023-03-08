package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.MakeMessage;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;


public class App2 {

	public static void main(String[] args) {
		Service<Integer, ItemDTO> service = new ItemService();
		SearchService search = new ItemService();

		// ItemService service = new ItemService(); //이렇게 하면 아이템서비스 객체를 그대로 사용하기 때문에
		// 폴리머피즘이 힘들다~

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u,s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("s")) {
				search.search();
			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO item = new ItemDTO(id, name, price, qt);

				try {
					service.register(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
					System.out.println(e.getMessage()); // 에러코드 확인용
				}

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				// 예외 처리
				try {
					int id = Integer.parseInt(sc.next());
					service.remove(id);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
					System.out.println(e.getMessage()); // 에러코드 확인용
				}

			} else if (cmd.equals("u")) {
				System.out.println("Update ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Update NAME...");
				String name = sc.next();
				System.out.println("Update Price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Update Quantity...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					service.modify(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
					System.out.println(e.getMessage()); // 에러코드 확인용
				}
			}
		}
		sc.close();
	}

}