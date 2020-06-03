package test.main;

import java.util.Random;

public class MainClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. cherry, apple, banana, melon, 7 5개의 문자열 중에서 하나가 랜덤하게 출력되게 해보세요.
		 */
		System.out.println("1번문제");
		String[] str = { "cherry", "apple", "banana", "melon", "7" };

		Random ran = new Random();

		int index = ran.nextInt(5);

		System.out.println(str[index]);

		/*
		 * 2. 5개의 문자열 중에서 3개가 한 줄에 한 번에 랜덤하게 출력되게 해보세요
		 */

		System.out.println("2번문제");

		for (int j = 0; j < 3; j++) { 
			index = ran.nextInt(5);
			System.out.print(str[index] + " | ");
		}

	}

}
