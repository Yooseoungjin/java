package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
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
		String selectSql = "SELECT * FROM cust where id = ?";

		// Statement 생성 - SQL
		// SQL 전송

		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectSql);) {
			pstmt.setString(1, "id01");
		
			try(ResultSet rset = pstmt.executeQuery()){
				rset.next(); //data가 두번째 행에서 시작되므로 넥스트를 넣어서 처리하는 것
				String db_id = rset.getString("id"); //위에 변수랑 중복되서 db_를 넣음
				String db_pwd = rset.getString("pwd");//위에 변수랑 중복되서 db_를 넣음
				String name = rset.getString("name");
				int age = rset.getInt("age");			
				System.out.println(db_id+" "+name+" "+age);
			}catch(SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
