package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencill", "연필");
		dic.put("eraser", "지우개");

		Scanner scan1 = new Scanner(System.in);

		/*
		 * 검색할 단어를 입력하세요 : house
		 * 
		 * house의 뜻은 집입니다.
		 */
		while (true) {
			System.out.print("검색 할 단어를 입력하세요 : ");
			String str = scan1.nextLine();

			
			if (dic.containsKey(str) == true) {
				System.out.println(str + "의 뜻은 " + dic.get(str) + "입니다.");
			} else {
				System.out.println("입력한 내용이 존재하지 않습니다.");
			}

		}

	}
}
