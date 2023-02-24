package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 95.1111111;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("남자네요");
		}else {
			System.out.println("여자네요");
		}		
		
//		if(sum >= 90) {
//			grade = "VIP";
//		}else if(sum >= 70.0) {
//			grade = "GOLD";
//		}else{
//			grade = "SILVER";
//		}
		
		  grade = (sum >= 90.0) ? "VIP" 
				: ((sum >= 70.0) ? "GOLD"
				: "SILVER");
		
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택 맥북공짜....");
//			return;
		}
				
		System.out.printf("%s,%s,%4.2f \n",grade,gender,sum);
		System.out.println("End....");
	}

}
