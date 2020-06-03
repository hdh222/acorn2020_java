package test.main;
/*
 * [기본 data type의 참조 data type]
 * 
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean : Boolean
 */
public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본 데이터 type	(stack 영역 저장)
		int num1 = 10;
		//참조 데이터 type  (heap 영역 저장)
		Integer num2 = 10;
		
		//참조 데이터 type 이지만 기본 데이터 type 처럼 사용할 수 있다.		
		int result1 = num2 + 1;
		int result2 = num1 + num2;
		Integer result3 = num1 + num2;
		
		String str = num2.toString();		//정수를 문자열로 바꿔서 저장
		
		String strNum2 ="999";
		Integer.parseInt(strNum2);			//문자열을 정수로
	}

}
