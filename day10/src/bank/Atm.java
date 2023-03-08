package bank;

public class Atm {

	public static void main(String[] args) {
		Account acc1 = null; // try문 밖에서 선언하도록 연습하라
		try {
			acc1 = new Account(-10000);
			System.out.println(acc1);
			acc1.widthdaw(12000);
			System.out.println(acc1);
			acc1.widthdaw(-5000);
			System.out.println(acc1);
		} catch (Exception e) {
			System.out.println(MakeMessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
		}
	}

}
