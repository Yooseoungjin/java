package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.CustDTO;
import com.kbstar.dto.TrDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceimpl;

public class App {

	public static void main(String[] args) {
		BankService<CustDTO, AccountDTO, TrDTO, String, String> service = new BankServiceimpl();
		service = new BankServiceimpl();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Login(l) or Rehister(r) (q)...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				break;
			} else if (cmd.equals("r")) {
				System.out.println("Register..");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				String contact = sc.next();
				CustDTO user = new CustDTO(id, pwd, name, contact); // 에 입력된 유저객체 저장
				try {
					service.register(user);
					System.out.println("가입을 환입합니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("l")) {
				System.out.println("Login..");
				String id = sc.next();
				String pwd = sc.next();
				CustDTO user = null;
				try {
					user = service.login(id, pwd);
					System.out.println(user);
//					System.out.println("로그인 성공");
					System.out.println("------------------------------");

					while (true) {
						System.out.println("Menu(m,t,a,i,tr,e)....");
						String cmn = sc.next();
						if (cmn.equals("e")) {
							break;
						} else if (cmn.equals("m")) {
							System.out.println("Make Account");
							double balance = Double.parseDouble(sc.next());
							service.makeAccount(user.getId(), balance);
							System.out.println("Make Account Completed");
						} else if (cmn.equals("t")) {
							System.out.println("Transaction");
							String sendAcc = sc.next();
							String receiveAcc = sc.next();
							double balance = Double.parseDouble(sc.next());
							String desc = sc.next();
							service.transaction(sendAcc, receiveAcc, balance, desc);
							System.out.println("Transaction Completed...");

						} else if (cmn.equals("a")) {
							System.out.println("Select Account");
							List<AccountDTO> list = null;
							list = service.getAllAccount(user.getId());
							for (AccountDTO acc : list) {
								System.out.println(acc);
							}
						} else if (cmn.equals("i")) {
							System.out.println("User Info");
							String rid = user.getId();
							CustDTO ruser = null;
							ruser = service.getUserInfo(rid);
							System.out.println(ruser);

						} else if (cmn.equals("tr")) {
							System.out.println("Select Transaction");
							String accNo = sc.next();
							List<TrDTO> list = null;
							list = service.getAllTr(accNo);
							for (TrDTO tr : list) {
								System.out.println(tr);
							}
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		sc.close();
	}
}
