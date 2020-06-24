package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 문자열을 두번 입력 받는다.
		 * 새로 추가 할 이름과 주소를 입력받아서
		 * MemberDaoㄱ개체를 이용해서 DB에 저장하는 code를 작성해보세요.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		System.out.println("주소를 입력하세요 : ");
		String addr = scan.nextLine();
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto();
		
		dto.setName(name);
		dto.setAddr(addr);
		
		dao.insert(dto);
	}
}
