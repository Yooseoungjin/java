package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllTest {
	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공.");

		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.64:1521:XE";
		String selectAllSql = "SELECT * FROM cust order by id";

		// Statement 생성 - SQL
		// SQL 전송

		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectAllSql);) {
		
			try(ResultSet rset = pstmt.executeQuery()){
				while(rset.next()) { //데이터를 순차적으로 꺼내면서 더이상 없는 경우 while문이 끝난다
					String db_id = rset.getString("id"); //위에 변수랑 중복되서 db_를 넣음
					String db_pwd = rset.getString("pwd");//위에 변수랑 중복되서 db_를 넣음
					String name = rset.getString("name");
					int age = rset.getInt("age");			
					System.out.println(db_id+" "+name+" "+age);
				}			
			}catch(SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
