package test.main;

import java.util.Random;

/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

public class MainClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 프로그래밍의 목적 : 무작위 정수를 얻어내고 싶다.
		 * 얻어내서 콘솔창에 출력하고싶다.
		 */
		//객체를 생성해서 참조값을 지역변수에 담기
		Random ran = new Random();
		
		ran.nextBoolean();
		
		//메소드를 호출하고 리턴되는 값을 지역변수에 담기
		int a = ran.nextInt();
		//콘솔창에 출력
		System.out.println(a);
		
		/*
		 * 해결해야 하는 문제 : 원하는 범위 내에서 정수값을 얻어내고 싶다.
		 * 범위 1~45
		 * 콘솔창에 출력
		 */
		
		int lotto = ran.nextInt(45)+1;
		System.out.println(lotto);
		
	}

}
