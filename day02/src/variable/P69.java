package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase(); //오른쪽인 투어퍼가 실행됨. 따라서 힙 메모리에 대문자 ABCDEF가 생성된다
		System.out.println(str);
		
		String str2 = str.replace('A', 'Z');
		System.out.println(str2);
		
		int lng = str.length();
		System.out.println(lng);
		
		int t = str.indexOf("F");
		System.out.println(t);
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String str3 = str.substring(1,6);
		System.out.println(str3);
		
		String email = "jmlee@tonesol.com";
				
		String id = "";
		String domain = "";
		
		System.out.printf("%s, %s",id,domain);
	}

}
