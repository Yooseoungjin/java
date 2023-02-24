package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		System.out.println("Start ...");
		int i = 1;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		while (i <= 100) {
			sum +=i;
			i++;
			cnt++;
		}
		System.out.println(i);
		System.out.println(cnt);
		//avg = (sum*1.0)/(i-1);
		avg = sum/(cnt*1.0); 
		System.out.printf("%d,%f",sum,avg);
	}

}
