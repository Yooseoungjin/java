package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		int a = 1222;
		int b = 1000;		
		int c= -1;	
		
		// 세수의 최대 값과 최소 값을 구하시오
		int max =0;
		int min =0;
	
//		if ((a > b && a > c)&&(b > c)) {
//			max = a;
//			min = c;}
//		else if ((a > b && a > c)&&(b < c)) {
//			max = a;
//			min = b;}
//		else if((b > c && b > a )&&(a > c)) {
//			max = b;
//			min = c;}
//		else if((b > c && b > a )&&(a < c)) {
//			max = b;
//			min = a;}
//		else if((c > a && c > b )&&(a > b)) {
//			max = c;
//			min = b;}
//		else if((c > a && c > b )&&(a < b)) {
//			max = c;
//			min = a;}

//		max = (a>b)?((a>c)? a:c):(b>c)?b:c;
//		min = (a<b)?((a<c)? a:c):(b<c)?b:c;
		
		if(a > b) {
			max = Math.max(a,c);	
			min = Math.min(b,c);
		}else {
			max = Math.max(b,c);	
			min = Math.min(a,c);
		}
				
		System.out.printf("max: %d,min: %d",max,min);
		}
	}
