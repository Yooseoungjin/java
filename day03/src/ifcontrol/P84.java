package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "F";
		double sum = 90.00;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("남자네요");
		}else {
			System.out.println("여자네요");
		}
		
//		if((gender.equals("M"))&&(sum >= 90.0 )) {
//			grade = "MVIP";}
//		else if((gender.equals("F"))&&(sum >= 90.0 )) {
//			grade = "FVIP";}
//		else if((gender.equals("M"))&&(sum >= 80.0 )) {
//			grade = "MGOLD";}
//		else if((gender.equals("F"))&&(sum >= 80.0 )) {
//			grade = "FGOLD";}
//		else if((gender.equals("M"))&&(sum < 80.0 )) {
//			grade = "MNORMAL";}
//		else if((gender.equals("F"))&&(sum < 80.0 )) {
//			grade = "MNORMAL";}
		
		if(gender.equals("M")) {
			if(sum >= 90) 
			{grade = "MVIP";}
			else if(sum >= 80)
			{grade = "MGOLD";}
			else 
			{grade = "MNORMAL";}
			}		
		else{
			if(sum >= 90) 
			{grade = "FVIP";}
			else if(sum >= 80)
			{grade = "FGOLD";}
			else 
			{grade = "FNORMAL";}
			}
				
//		switch(grade) {
//		case "FVIP":
////			sum +=100; 삭제가능
////			break; 	   삭제가능	
//		case "MVIP":
//			sum += 100;
//			break;
//		case "FGOLD":
////			sum += 90; 삭제가능
////			break;     삭제가능
//		case "MGOLD":
//			sum += 90;
//			break;
//		default:
//			sum += 10;
//		}		
		
		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
//			break; < 삭제하는 경우VIP는 GOLD의 혜택을 추가로 받음
		case "FGOLD":
		case "MGOLD":
			sum += 90;
//			break;< 삭제하는 경우VIP와 GOLD는 디폴트 혜택을 추가로 받음
		default:
			sum += 10;
		}
		
		System.out.printf("%s,%s,%4.2f \n",grade,gender,sum);
		System.out.println("End....");
	}

}
