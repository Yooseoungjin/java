package com.kbstar.frame;

public interface DAO<K, V> { // 제네릭사용
	public static final String IP = "127.0.0.1"; // 퍼블릭~파이널은 생략해도 자동으로 컴파일 됨. 통상적으로 대문자로 작성

	public void insert(V v)throws Exception;
	public void delete(K k)throws Exception;
	public void update(V v)throws Exception; // 앱스트랙 생략가능, 기본적으로 추상 메소드니까~ day08참고해라~

	default void connect() {
		System.out.println(IP + "에 접속 하였습니다.");
	}
	default void close() {
		System.out.println(IP + "에 접속을 해제 하였습니다.");
	}
}
