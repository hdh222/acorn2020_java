package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 가변 배열 객체 생성
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//nums의 크기
		int size = nums.size();
		
		//해당 인덱스 아이템 얻어오기 (참조)
		int num1 = nums.get(0);
		Integer num2 = nums.get(1);
		int num3 = nums.get(2);
		
		//해당 인덱스 수정
		nums.set(0, 40);
		
		//해당 인덱스 삭제
		nums.remove(1);
		
		//전부삭제
		
		nums.clear();
		
	}
}
