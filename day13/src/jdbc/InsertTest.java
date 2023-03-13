package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다");
			e.printStackTrace();
			return; // 예외사항 발생시 밑에 driver loading 성공을 실행하지 않기 위해 리턴 함
		}
		System.out.println("Driver Loading 성공.");
		
		// Connect
		String id = "bank"; //id는 오라클의 웤스페이스이다
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.64:1521:XE"; //팀원들과 공유하는 IP(조장님 꺼)
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("접속 실패!!");
			e.printStackTrace();
			return;
		}
		System.out.println("접속 성공!!");

		// Statement 생성 - SQL
		// SQL전송
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			 pstmt = con.prepareStatement(insertSql);
			 pstmt.setString(1, "id98");
			 pstmt.setString(2, "pwd98");
			 pstmt.setString(3, "그리스신화");
			 pstmt.setInt(4, 16);
			 int result = pstmt.executeUpdate(); //우리가 보낸 내용을 업데이트 친다
			 System.out.println(result);			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}finally {
			 try {
				 if(pstmt !=null) {
					 pstmt.close();
				 }
				pstmt.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
				
		// 결과 받기

		// close
		try {
			if(con !=null) {
				con.close();
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("close 실패!!");
			e.printStackTrace();
		}
		System.out.println("close 성공!!");

	}

}
