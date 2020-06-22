package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * member 테이블에 저장된 모든 회원의 정보를 
		 * 번호에 대해서 오름차순 정렬해서
		 * List<MemberDto> 객체에 담아 오려고 한다.
		 * 
		 */
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> memberList = new ArrayList<>();
		try {
			String sql = "select * from member order by num ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//회원정보 저장
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				
//				MemberDto mDto = new MemberDto(num, name, addr);
//				memberList.add(mDto);
				
				//리스트에 모든 회원정보 추가
				memberList.add(new MemberDto(num, name, addr));
				
				printMember(memberList);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void printMember(List<MemberDto> list) {
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum() + " | " + tmp.getName() +
					" | " + tmp.getAddr());
		}
	}
}
