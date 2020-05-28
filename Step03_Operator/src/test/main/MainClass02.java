package test.main;
/*
 *  2. 증감 연산자 테스트
 *  	변수에 있는 숫자 값을 1씩 증가시킨다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++; 
		num++;
		num++;		//num이 최종적으로 3이된다.
		
		int num2=0;
		num2--; 
		num2--;
		num2--;		//num2가 최종적으로 -3이된다
		
		int num3=0;
		int result1 = num3++; 	//result1의 값은 0이다
		
		int num4=0;
		int result2 = ++num4;	//result2의 값은 1이다.
	}
}












