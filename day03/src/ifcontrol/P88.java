package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 68.0;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("남자네요");
		}else {
			System.out.println("여자네요");
		}
		
//		if(sum >= 95 ) {
//			grade = "VIP";
//		}else if(sum >= 85.0 && sum <= 90.0 ) {
//			grade = "VIP";
//
//		}else if(sum >= 80.0 && sum <= 75.0 ) {
//			grade = "GOLD";
//		}else if(sum >= 65.0 && sum <= 60.0 ) {
//			grade = "GOLD";
//		}else{
//			grade = "NORMAL";
//		}
		
		
		if((sum <=100&&sum >= 95)||(sum <= 85.0 && sum >= 90.0 )) {
		grade = "VIP";}
		if((sum <=80&&sum >= 75)||(sum >= 70.0 && sum <= 65.0 )) {
			grade = "GOLD";}
	
		
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택 맥북공짜....");
//			return;
		}
				
		System.out.printf("%s,%s,%4.2f \n",grade,gender,sum);
		System.out.println("End....");
	}

}
