package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDto m1 = new MemberDto();
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");
		
		//인자로 필드에 저장할 생성자를 이용해서 객체를 생성한 경우
		MemberDto m2 = new MemberDto(2, "해골", "행신동");
		
		//위에서 생성한 객체의 참조값을 List 객체에 담아보세요
		List<MemberDto> arr = new ArrayList<MemberDto>();
		
		arr.add(m1);
		arr.add(m2);
		
		//for문을 이용해서 List 객체에 담긴 MemberDto 객체를 순서대로 참조해서 아래와 같은 형식으로 출력해보세요
		for(int i = 0; i < arr.size(); i++) {
			MemberDto tmp = arr.get(i);
			System.out.println(tmp.getNum() +" | " + tmp.getName() +" | " + tmp.getAddr());
		}
		
		for(MemberDto tmp : arr) {
			System.out.println(tmp.getNum() +" | " + tmp.getName() +" | " + tmp.getAddr());
		}
		
		//참조테스트
		List<MemberDto> a = arr;
		MemberDto b = arr.get(0);
		int c = arr.get(0).getNum();
		String d = arr.get(0).getName();
		String e = arr.get(0).getAddr();
		int f = arr.get(0).getName().length();
		boolean g = arr.get(0).getAddr().equals("노량진");
		
		
	}

}
