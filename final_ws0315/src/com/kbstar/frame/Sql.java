package com.kbstar.frame;

public class Sql {
	//Account DML
	public static String accinsertSql = "INSERT INTO account VALUES(?,?,SYSDATE,?)";
	public static String accdeleteSql = "DELETE FROM account WHERE ACCNO = ?";
	public static String accupdateSql = "UPDATE account SET pwd=?, name=?, age=? WHERE ACCNO=?";
	public static String accselectSql = "SELECT * FROM account where ACCNO = ?";
	public static String accselectAllSql = "SELECT * FROM account order by ACCNO";
}
