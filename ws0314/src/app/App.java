package app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.ShopService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.CustCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;
import com.kbstar.service.ShopServiceImpl;

public class App {
	public static void main(String[] args) {

		// register, login, mycart
		ShopService<Cust, Cart> shopService = new ShopServiceImpl();
		CRUDService<String, Cust> custService = new CustCRUDServiceImpl();
		CRUDService<String, Item> itmeService = new ItemCRUDServiceImpl();
		CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----   Shop Mall Program -----");
			System.out.println("Login(l) or Register(r) (q) ...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			} else if (cmd.equals("r")) {
				System.out.println("Register.. ");
				System.out.println("Input ID.. ");
				String id = sc.next();
				System.out.println("Input PWD.. ");
				String pwd = sc.next();
				System.out.println("Input NAME.. ");
				String name = sc.next();
				Cust cust = new Cust(id, pwd, name, 20); // 나이는 만들기귀찮으니 디폴트로 20살 넣었다
				try {
					shopService.register(cust);
					System.out.println("가입을 환영합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("l")) {
				System.out.println("Login.. ");
				System.out.println("ID를 입력 하세요.. ");
				String id = sc.next();
				System.out.println("PWD를 입력 하세요.. ");
				String pwd = sc.next();
				Cust cust = null; // 로그인이 유지되면 커스트 정보를 유지하기 유해 넣음
				try {
					cust = shopService.login(id, pwd); // 로그인이 정상이면 cust정보가 리턴된다는 말
					System.out.println("----------------------------");
					while (true) {
						System.out.println("Menu(사용자정보조회(c),상품조회(it),카트입력(i),카트조회(ci),나가기(e))...");
						String cmn = sc.next();
						if (cmn.equals("e")) {
							System.out.println("Logout...");
							break;
						} else if (cmn.equals("c")) {
							System.out.println("사용자정보조회...");
							Cust custInfo = null;
							custInfo = custService.get(cust.getId());
							System.out.println(custInfo);
						} else if (cmn.equals("it")) {
							System.out.println("상품조회");
							List<Item> list = null;
							list = itmeService.get();
							for(Item item:list) {
								System.out.println(item);
							}
						} else if (cmn.equals("i")) {
							System.out.println("카트입력");
							System.out.println("상품ID입력...."); 
							String item_id =sc.next();
							System.out.println("갯수입력....");
							int cnt =Integer.parseInt(sc.next());
												
							Cart cart = new Cart(cust.getId(),item_id,cnt);
							cartService.register(cart);							
							System.out.printf("장바구니에 %s를 %d개 입력\n",item_id,cnt);
							
						} else if (cmn.equals("ci")) {
							System.out.println("나의 카트조회...");
							List<Cart> list = null;
							list = shopService.myCart(cust.getId());
							for(Cart cart:list) {
								System.out.println(cart);
							}
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		sc.close();
	}
}