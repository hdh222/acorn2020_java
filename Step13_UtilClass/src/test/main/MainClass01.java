package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type을 저장할 수 있는 index로 관리되는 목록(List) 객체
		//참조 데이터 타입만 저장이 가능하다. 
		ArrayList<String> names = new ArrayList<String>();
		
		//String type의 참조 값 저장하기
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		System.out.println(names);
		
		//방의 크기 
		int size = names.size(); 
		
		//각각의 방에 저장된 값 불러오기
		String name1 = names.get(0);
		String name2 = names.get(1);
		String name3 = names.get(2);
		
		//특정 방의 값 수정 (덮어쓰기)
		names.set(0, "이정호");
		
		//특정인덱스 삭제
		names.remove(1); //1번방 삭제
		
		names.clear();
		
		System.out.println(names);
	}
}
