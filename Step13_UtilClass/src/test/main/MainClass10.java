package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		Map<String, Object> map1 = new HashMap<>();
		
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		map1.put("Phone", "010-1111-2222");
		
		//이름을 참조하려면
		String name = (String)map1.get("name");
		
		//전화번호를 수정하려면 
		map1.put("Phone", "010-3333-4444");
		
		//isMan 이라는 키값이 존재하는ㄴ지 여부
		boolean isExist = map1.containsKey("isMan");
		
		//num이라는 키값으로 저장된 값 삭제
		map1.remove("num");
		
		//전체삭제
		map1.clear();
	}
}
