package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		while (true) {
			System.out.println("Input cmd(r,u,d,g,q)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye.");
				break; // 왜 브레이크를 쓴다구? 잘 이해가 안간다요..
			} else if (cmd.equals("r")) {
				System.out.println("Input contents");
				String content = sc.next();
				service.register(content);

			} else if (cmd.equals("g")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);

			} else if (cmd.equals("d")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				/* String result = */ service.remove(num); // 앞에 리절트는 필요벗다 뭘 가져올게 없으니께
			} else if (cmd.equals("u")) {
				System.out.println("Input number & content");
				int num = Integer.parseInt(sc.next());
				String content = sc.next();
				service.modify(num, content);
			}

		}
		sc.close();
	}
}