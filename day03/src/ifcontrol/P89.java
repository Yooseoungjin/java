package ifcontrol;

public class P89 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "F";
		double sum = 1.00;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("남자네요");
		}else {
			System.out.println("여자네요");
		}

//		  grade = ((gender.equals("M"))&&(sum >= 90.0) ? "MVIP" 
//				: ((gender.equals("M"))&&(sum >= 80.0) ? "MGOLD"
//				: ((gender.equals("M"))&&(sum < 80.0) ? "MNORMAL"
//				: ((gender.equals("F"))&&(sum >= 90.0) ? "FVIP"
//				: ((gender.equals("F"))&&(sum >= 80.0) ? "FGOLD"
//				:"FNORMAL")))));
		  
		  grade = (gender.equals("M"))?
				  ((sum >= 90) ? "MVIP" : sum >= 80 ? "MGOLD" : "MNORMAL") :
				  ((sum >= 90) ? "FVIP" : sum >= 80 ? "FGOLD" : "FNORMAL");
		  
		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
		case "FGOLD":
		case "MGOLD":
			sum += 90;
		default:
			sum += 10;
		}
		System.out.printf("%s,%s,%4.2f \n",grade,gender,sum);
		System.out.println("End....");
	}

}
