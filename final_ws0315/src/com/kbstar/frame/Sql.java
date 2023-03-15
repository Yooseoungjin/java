package com.kbstar.frame;

public class Sql {
	// Account DML
	public static String accinsertSql = "INSERT INTO account VALUES(?,?,SYSDATE,?)";
	public static String accdeleteSql = "DELETE FROM account WHERE ACCNO = ?";
	public static String accupdateSql = "UPDATE account SET pwd=?, name=?, age=? WHERE ACCNO=?";
	public static String accselectSql = "SELECT * FROM account where ACCNO = ?";
	public static String accselectAllSql = "SELECT * FROM account order by ACCNO";
	public static String myaccselectAllSql = "SELECT * FROM account where holder_id = ?";

	// Cust SQL
	public static String custInsertSql = "INSERT INTO cust VALUES(?,?,?,?,SYSDATE)";
	public static String CustDeleteSql = "DELETE FROM cust WHERE id=?";
	public static String CustUpdateSql = "UPDATE cust SET pwd=?, name=?, contact=? WHERE id=?";
	public static String CustSelectSql = "SELECT * FROM cust WHERE id=?";
	public static String CustSelectAllSql = "SELECT * FROM cust";
	
	// tr DML //거래내역 이므로 delete, update 없음.

	public static String trInsertSql = "INSERT INTO tr VALUES (?,?,?,?,?,?,SYSDATE)";
	public static String trSelectAllSql = "SELECT * FROM tr"; //전체 계좌의 전체 거래내역 조회하기
	public static String trSelectSql = "Select * FROM tr WHERE myAcc=?"; //내 계좌 거래내역 조회하기
}
