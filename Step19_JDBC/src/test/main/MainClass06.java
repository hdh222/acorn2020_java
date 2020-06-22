package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 3번회원을 삭제하는 code를 작성해보세요
		 */

		// DB 연결객체를 담을 지역변수 만들기
//		DBConnect DB = new DBConnect();
//		Connection conn = DB.getConn();
		
		Connection conn = new DBConnect().getConn();
		int num = 3;
		
		
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from member where num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			System.out.println("삭제완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
