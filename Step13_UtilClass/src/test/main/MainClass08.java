package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap <Key 값의 Type, value 값의 type
		 * HashMap은 Map타입으로 많이 받는다.
		 */
		Map<String, Object> map = new HashMap<>();
		
		map.put("num", 1);
		map.put("name","김구라");
		map.put("addr","노량진");
		
		/*
		 * value 의 generic 클래스가 Object로 지정되어 있어 
		 * 리턴되는 Object type을 원래 type으로 castring애햐한다.
		 */
		
		int num = (int)map.get("num");
		String name = (String)map.get("name");
		String addr = (String)map.get("addr");
		
	}	

}

//해쉬맵은 두 개의 제너릭이 필요하다. key, vlaue
