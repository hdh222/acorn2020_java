package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3명의 회원정보( 번호, 이름, 주소 )를 해쉬맵 객체에 담고 
		 * HashMap 객체의 참조값을 ArrayList 객체에 순서대로 담아보세요
		 * 
		 */
		Map<String, Object> infoMap1 = new HashMap<>();
		Map<String, Object> infoMap2 = new HashMap<>();
		Map<String, Object> infoMap3 = new HashMap<>();
		
		infoMap1.put("num",1);
		infoMap1.put("name","김구라");
		infoMap1.put("addr","노량진");
		
		infoMap2.put("num",2);
		infoMap2.put("name","해골");
		infoMap2.put("addr","행신동");
		
		infoMap3.put("num",3);
		infoMap3.put("name","원숭이");
		infoMap3.put("addr","동물원");
		
		List<Map<String, Object>> arr = new ArrayList<>();
		arr.add(infoMap1);
		arr.add(infoMap2);
		arr.add(infoMap3);
		
		for(Map<String, Object> tmp: arr) {
			int num = (int)tmp.get("num");
			String name = (String)tmp.get("name");
			String addr = (String)tmp.get("addr");
			
			System.out.println(num + " | " + name + " | " + addr);
		}
		
		//참조연습
		List<Map<String, Object>> a = arr;
		Map<String, Object> b = arr.get(0);
		Object c = arr.get(0).get("num");
		Object d = arr.get(0).get("name");
		Object e = arr.get(0).get("addr");
		
		int f = (int)arr.get(0).get("num");
		String g = (String)arr.get(0).get("name");
		String h = (String)arr.get(0).get("addr");
		int i = ((String)arr.get(0).get("name")).length();
		
		boolean as = arr.get(0).get("name").equals("김구라");
	}

}
