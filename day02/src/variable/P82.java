package variable;

import java.util.Scanner;

public class P82 {

	public static void main(String[] args) {
		int score = 1;
				
		String grade = (score >= 90) ? "A" 
				: ((score >= 80) ? "B" 
				: ((score >= 70) ? "C" 
				: "탈락"));
			
		System.out.println(grade);

		}
}