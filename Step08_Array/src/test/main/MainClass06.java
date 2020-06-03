package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner 객체를 이용해서 문자열을 5번 입력받는다.
		 * 입력받은 문자열은 차례대로 배열에 저장되어야 한다.
		 * 
		 * 모두 입력 받은 후 for문을 이용해서 배열에 저장된 
		 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해보세요
		 */
		String[] str = new String[5];
		Scanner scan1 = new Scanner(System.in);
		for(int i = 0; i < str.length; i++) {
			System.out.println("문자열을 입력 하세요 : ");
			str[i] = scan1.next();
		}
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		/*
		 * 2. Random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서 배열에 저장한다.
		 * 모두 저장이되면 for문을 이용해서 배열에 저장된 모든 로또 번호를 콘솔창에 순서대로 출력한다.
		 */

		int[] lotto = new int[6];			//정수형 배열 생성
		Random ran = new Random();
		for(int i = 0; i < lotto.length; i++) {
			
			int number = ran.nextInt(45)+1;	//난수저장

			for(int j = 0; j < i; j++) {
				if(number == lotto[j]) {	//중복 제거
					number = ran.nextInt(45)+1;
				}
			}
			lotto[i] = number;
		}

		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
//		for(int i = 0; i < lotto.length; i++) {
//			int tmp=lotto[i];
//			System.out.println(tmp);
//		}

		//위의 주석 처리 된 내용을 간략화 시킨 반복문 
		for(int tmp:lotto) {
			System.out.println(tmp);
		}
	}

}
