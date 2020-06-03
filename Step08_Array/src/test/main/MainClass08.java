package test.main;

import java.util.Random;

public class MainClass08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		
		Random ran = new Random();
		
		int nums[] = new int[3];
		
		for(int i = 0; i < nums.length; i++) {
			int ranNum = ran.nextInt(5);
			nums[i] = ranNum;
		}
		
		int one =nums[0];
		int two = nums[1];
		int three = nums[2];
		
		System.out.println(items[one] + " | " + items[two] + " | " + items[three]);
		System.out.println(items[nums[0]] + " | " + items[nums[1]] + " | " + items[nums[2]]);
	}

}
