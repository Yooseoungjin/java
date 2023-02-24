package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 90.1111111;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("남자네요");
		}else {
			System.out.println("여자네요");
		}
		
		System.out.println("우리회사의 고객등급이 아래와 같이 변경 되었다 \n"
				+ "100~90 :VIP\n"
				+ "89~80 :GOLD\n"
				+ "79~70 :SILVER\n"
				+ "69~60 :BRONZE\n"
				+ "59이하 :NORMAL\n");
		
		if(sum >= 90) 
			{grade = "VIP";}
		else if(sum >= 80.0) 
			{grade = "GOLD";}
		else if(sum >= 70.0) 
			{grade = "SILVER";}
		else if(sum >= 60.0) 
			{grade = "BRONZE";}
		else{grade = "NORMAL";}
				
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택 맥북공짜!.");
//			return;
		}
				
		System.out.printf("%s,%s,%4.2f \n",grade,gender,sum);
		System.out.println("End....");
	}

}
