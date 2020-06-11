package test.main;

import java.util.Scanner;
/*
 * RuntimeException 을 상속받은 exception 종류는 try ~ catch 블럭으로
 * 묶어주지 않아도 문법오류가 발생하지 않는다.
 * 따라서 필요시 선택적으로 try ~ catch 블럭으로 묶어준다.
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("나눌수입력 : ");
			String inputNum1 = scan.nextLine();
			
			System.out.println("나누어 지는 수 입력  :");
			String inputNum2 = scan.nextLine();
			
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			int result = num2 / num1;
			int result2 = num2 % num1;
			
			System.out.println(num2 + " 를" +num1+"으로 나눈 몫 :" +result);
			System.out.println(num2 + " 를" +num1+"로 나눈 나머지 : "+result2);
		}catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println("잘못입력했다.");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("무언가 마무리 작업을해요");
		}
		System.out.println("main메소드 종료됩니다.");
	}
}
//NumberFormatException
