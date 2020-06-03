package test.main;

import java.util.Random;

public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
