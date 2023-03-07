package com.kbstar.app;

import java.util.Scanner;
import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;
import com.kbstar.service.UserService;

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
				service.register(item);

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				// 예외 처리
				try {
					int id = Integer.parseInt(sc.next());
					service.remove(id);
				} catch (Exception e) {
					System.out.println("잘못 입력 하셨어요");
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
				service.modify(item);
			}
		}
		sc.close();
	}

}