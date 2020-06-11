package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//숫자형식의 문자열을 입력 받는다. "10" "20" "10.1" 등등
		System.out.print("숫자입력 : ");
		try {
			String inputNum = scan.nextLine();

			//입력한 숫자를 실제 숫자로 바꾼다.
			double num = Double.parseDouble(inputNum);
			//입력한 숫자에 100을 더한다.
			double result = num + 100;
			System.out.println("입력한 숫자 + 100 : " +result);
			
		}catch(NumberFormatException e) {
			System.out.println("숫자 형식에 맞게 입력하세요.");
			e.printStackTrace();
		}
		System.out.println("main메소드가 종료됩니다.");
		


	}
}
