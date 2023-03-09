package com.kbstar.frame;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
			case "ER0001":result = "계좌개설 실패....";break;
			case "ER0002":result = "음수 입력....";break;
			case "ER0003":result = "잔액 부족....";break;
			case "EX0004":result = "아이디 중복....";break;
			case "EX0005":result = "해당 아이디 삭제 불가....";break;
			case "EX0006":result = "해당 아이디 수정불가....";break;
			default:result = "고객센터로 문의 바랍니다..♥";
		}
		return result;
	}

}
