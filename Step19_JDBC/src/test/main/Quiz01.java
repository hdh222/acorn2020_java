package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Quiz01 {
	public static void main(String[] args) {
		Connection conn = null;
		int num = 2;
		String name ="해골";
		String addr ="행신동";
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 접속할 DB의 정보 @아이피주소:port번호:db이름
			 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url , "scott", "tiger");

			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공
			System.out.println("Oracle DB 접속 성공");

			// SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 만들기

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into member (num, name, addr) values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			
			pstmt.executeUpdate();
			
			System.out.println("입력완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
