package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 	JDBC(Java DataBase Connectivity)
 * 
 * 	DataBase에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 * 
 * 	Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을 
 * 	사용할 수 있도록 설정 해야한다.
 * 
 *	
 */

public class MainClass01 {
	public static void main(String[] args) {
		// DB 연결객체를 담을 지역변수 만들기

		Connection conn = null;

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

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement pstmt = null;

			ResultSet rs = null;

			// 실행할 sql문 (띄어쓰기 조심)
			String sql = "SELECT num, name, addr FROM member" 
							+ " ORDER BY num ASC";
			// preparedStatement 객체 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체를 이용해서 query 문 수행하고 결과를 resultSet 객체로 받아오기
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");		//메소드 안에 칼럼명
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				
				//출력
				System.out.println(num + " | " + name + " | " + addr);
			}
			//rs는 커서의 위치에 있는 데이터를 출력할 수 있다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}