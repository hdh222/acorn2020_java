package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		//만일 MemberDao 객체의 참조값이 필요하다면?
		//MemberDao dao = new MemberDao(); 직접 객체 생성 불가
		
		//static 메소드를 이용해서 MemberDao 객체의 참조값을 받아올 수 있다.
		MemberDao dao = MemberDao.getInstance();
		
		//ex) 새로 추가 할 회원정보
		MemberDto dto = new MemberDto();
		dto.setName("덩어리");
		dto.setAddr("상도동");
		
		//MemberDao 객체의 메소드를 활용해서 저장할 수 있다.
		dao.insert(dto);
		
		MemberDao dao2 = MemberDao.getInstance();
		
		MemberDto dto2 = new MemberDto(1, "김구라", "독산동");
		dao2.update(dto2);
		
		MemberDto data = dao.getData(1);
		
		List<MemberDto> list = dao.getList();
		 
	}
}
//new를 못하게 한 이유
//dao 객체가 많이 만들어지는것을 막기 위해서
//객체가 하나만 만들어지기 때문에 dao와 dao2는 참조값이 같다.
//connection은 개수가 정해져 있다. connection이 부족해지는 상황을 막을 수 있다.