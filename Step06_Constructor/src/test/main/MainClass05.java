package test.main;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 키보드로부터 문자열을 입력받아 콘솔창에 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		//키보드로 입력받기 위해서는 일단 콘솔창을 열리게 해야한다.
		System.out.println("입력 : ");
		
		//Scanner 객체의 메소드를 이용해서 문자열(String)입력받기
		String str = scan.nextLine();
		System.out.println(str);
		str.length();
		System.out.println("main메소드 종료");
	}

}
