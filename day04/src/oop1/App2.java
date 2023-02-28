package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1 = new Car("K2","blue",2000); //new Car() 실행시 컨스트럭쳐 호출(=객체가 생성됨)
		car1.go();
		car1.stop();
		System.out.println("\n-----------------------------------------");
		Car car2 = new Car("K3","white",3000); //new Car() 실행시 컨스트럭쳐 호출(=객체가 생성됨)
		car2.go();
		car2.stop();

		
	}

}
