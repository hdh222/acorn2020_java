package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		double num1 = 10.1;					//기본 데이터 타입 double
		Double num2 = 10.2;					//참조 데이터 타입 Double
		
		
		//참조 데이터 타입 Double이지만 마치 기본 데이터 타입과 같이 사용할 수 있다.
		double result1 = num2 + 10;			
		double result2 = num1 + num2;
		Double result3 = num1 + num2;
		
		//숫자를 문자열로 바꾸기 10.1 => "10.1"
		String strNum = num2.toString();
		
		//문자열을 숫자(double)로 바꾸기
		
		Double.parseDouble(strNum);
	}
}
