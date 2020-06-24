package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서 회원목록을 얻어와서
		 * 아래와 같은 형식으로 출력해보세요.
		 * 
		 * 1 | 김구라 | 노량진
		 * 2 | 원숭이 | 상도동
		 * 
		 */
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		//Dao 참조값 얻어오기
		MemberDao dao = MemberDao.getInstance();
		//Dao 메소드를 이용해서 회원목록 얻어오기
		list = dao.getList();
		//반복문으로 원하는 형식으로 출력하기
		for(MemberDto tmp : list) {
			System.out.println(tmp.getNum() +" | " + tmp.getName() + " | " + tmp.getAddr());
		}
		
		System.out.println("-----------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			MemberDto tmp = list.get(i);
			System.out.println(tmp.getNum() +" | " + tmp.getName() + " | " + tmp.getAddr());
		}
	}
}
