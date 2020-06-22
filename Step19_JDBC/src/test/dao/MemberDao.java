package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.proxy.annotation.Pre;
import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * 	DAO (Data Access Object)
 * 
 * 	- 만드는 방법
 * 	1. 외부에서 객체 생성하지 못하도록 생성자의 접근 지정자를 private로 지정
 * 	2. 자신의 참조 값을 저장할 수 있는 필드를 private static 으로 선언
 * 	3. 자신의 참조값을 오직 하나만 생성해서 리턴해주는 static 메소드 만들기
 * 	4. 나머지 기능(select, insert, update, delete)들은 non static 으로 만들기
 */

public class MemberDao {
	// 자신의 참조값을 저장할 private 필드
	private static MemberDao dao;

	// 외부에서 객체 생성하지 못하도록한다.
	private MemberDao() {
	}

	// 참조값을 리턴해주는 메소드
	public static MemberDao getInstance() {
		if (dao == null) { // 최초 호출되면 null이므로
			dao = new MemberDao(); // 객체를 생성해서 static 필드에 담는다.
		}
		return dao;
	}

	// 회원 한명의 정보를 리턴해주는 메소드
	public MemberDto getData(int num) {
		Connection conn = new DBConnect().getConn();

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int number = 0;
		String name	= "";
		String addr	= "";
		try {
			String sql = "select * from member where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				number = rs.getInt("num");
				name = rs.getString("name");
				addr = rs.getString("addr");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return new MemberDto(number, name, addr);
	}

	// 회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList() {
		
		Connection conn = new DBConnect().getConn();

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int number = 0;
		String name	= "";
		String addr	= "";
		
		List<MemberDto> arr = new ArrayList<MemberDto>();
		
		try {
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
		
			rs = pstmt.executeQuery();

			while (rs.next()) {
				number = rs.getInt("num");
				name = rs.getString("name");
				addr = rs.getString("addr");
				
				arr.add(new MemberDto(number, name, addr));
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return arr;
	}

	// 회원 정보를 DB에 저장하는 메소드
	public void insert(MemberDto dto) {
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
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 회원 정보를 DB에서 수정하는 메소드
	public void update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();
			String sql = "update member" + " set name=?, addr=?" + " where num=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 회원 정보를 DB에서 삭제하는 메소드
	public void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();
			String sql = "delete from member" + " where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("회원정보를 삭제했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 회원정보를 DB에서 조회하는 메소드
	public void select(MemberDto dto) {

	}
}
