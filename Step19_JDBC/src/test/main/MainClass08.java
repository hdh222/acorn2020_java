package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		//추가 할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		
		//아래의 insert메소드를 호출해서 회원 한명의 정보가 추가되도록 해보세요.
		MemberDto m1 = new MemberDto();
		m1.setName(name);
		m1.setAddr(addr);
		
		insert(m1);
		
		
	}
	
	public static void insert(MemberDto dto) {
		Connection conn = new DBConnect().getConn();
		
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into member(num, name, addr) values(member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 try {
				if(pstmt != null)pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
