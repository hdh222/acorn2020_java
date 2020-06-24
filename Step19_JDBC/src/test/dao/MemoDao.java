package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemoDto;
import test.util.ConnectDB;
import test.util.DBConnect;

public class MemoDao {
	private static MemoDao dao;
	
	private MemoDao() {
		
	}
	
	public static MemoDao getInstance() {
		if (dao == null) { // 최초 호출되면 null이므로
			dao = new MemoDao(); // 객체를 생성해서 static 필드에 담는다.
		}
		return dao;
	}
	
	public boolean insert(MemoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = new ConnectDB().get_conn();
			String sql = "insert into memo values(MEMO_SEQ.NEXTVAL,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(result > 0) {
			return true;
		}else {
			return false;
		}
	}
	public MemoDto getData(int number) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int num = 0;
		String content = "";
		String date = "";
		
		try {
			String sql = "select * from memo where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				num = rs.getInt("num");
				content = rs.getString("content");
				date = rs.getString("regdate");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return new MemoDto(num, content, date);
		
	}
	
	public List<MemoDto> getlist(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<MemoDto> list = new ArrayList<MemoDto>();
		
		try {
			conn = new ConnectDB().get_conn();
			String sql = "select num, content, TO_CHAR(regdate,'YYYY.MM.DD AM HH:MI')"
					+ " as regdate from memo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int number = rs.getInt("num");
				String content = rs.getString("content");
				String date = rs.getString("regdate");
				
				list.add(new MemoDto(number, content, date));
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	public void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectDB().get_conn();
			String sql = "delete from memo where num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(MemoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectDB().get_conn();
			String sql = "update memo set content=? where num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getContent());
			
			System.out.println(dto.getContent());
			pstmt.setInt(2,dto.getNum());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<MemoDto> select(MemoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemoDto> list = new ArrayList<MemoDto>();
		int number = 0;
		String content = "";
		String date = "";
		try {
			conn = new ConnectDB().get_conn();
			String sql = "select num, content, TO_CHAR(regdate,'YYYY\"년\"MM\"월\"DD\"일\" AM HH:MI')"
					+ " as regdate"
					+ " from memo"
					+ " where content=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getContent());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				number = rs.getInt("num");
				content = rs.getString("content");
				date = rs.getString("regdate");
				
				list.add(new MemoDto(number, content, date));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
