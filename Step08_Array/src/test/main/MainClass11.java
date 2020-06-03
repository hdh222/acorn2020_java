package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {	//무한루프
			System.out.print("종료(q) 계속(enter) : ");
			String str = scan.nextLine();
			
			if(str.equals("q")) {		//문자열 비교
				break;
			}
			MainClass11.doGame();	//이전 예제에서 작업한 내용을 static 메소드에 이동시키고 해당 메소드 호출하기
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
	
	public static void doGame() {
		String[] items = { "cherry", "apple", "banana", "melon", "7" };
		int[] score = { 10, 20, 30, 40, 1000 };
		Random ran = new Random();

		int nums[] = new int[3];

		for (int i = 0; i < nums.length; i++) {
			int ranNum = ran.nextInt(5);
			nums[i] = ranNum;
		}

		System.out.println(items[nums[0]] + " | " + items[nums[1]] + " | " + items[nums[2]]);

		if (nums[0] == nums[1] && nums[0] == nums[2]) {
			if (nums[0] == 0) {
				System.out.println(score[0]+"점 입니다.");
			} else if (nums[0] == 1) {
				System.out.println(score[1]+"점 입니다.");
			} else if (nums[0] == 2) {
				System.out.println(score[2]+"점 입니다.");
			} else if (nums[0] == 3) {
				System.out.println(score[3]+"점 입니다.");
			} else if (nums[0] == 4) {
				System.out.println(score[4]+"점 입니다.");
			}
		} else {
			System.out.println("0점입니다.");
	}
	}
}
