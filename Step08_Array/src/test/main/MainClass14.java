package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위바위보 문자열 생성
		String[] items = {"가위", "바위", "보"};
		
		//사용자 입력을 받는다.
		Scanner scan = new Scanner(System.in);
		
		//컴퓨터가 랜덤하게 가위, 바위, 보를 정한다.
		Random ran = new Random();
		
		//사용자 입력을 받는다.
		System.out.println("가위 (s) 바위(r) 보(p)    입력 : ");
		String client = scan.nextLine();
		
		// "s"는 0, "r"은 1, "p"는 2로 바꾸어준다.
		int result_me = 0;
		
		if(client.equals("s")) {
			result_me = 0;
		}else if(client.equals("r")) {
			result_me = 1; 
		}else if(client.equals("p")) {
			result_me = 2;
		}else {
			result_me = -1;
		}
		
		String result;
		// computer 도 랜덤하게 하나의 숫자를 부여받는다.
		int com = ran.nextInt(3);
		
		if((result_me == 0 && com == 2) || (result_me == 1 && com == 0) || (result_me==2 && com == 1)) {		//내가 이기는 경우
			result = "win";
			System.out.println("승리");
		}else if(result_me == com) {			//비기는 경우
			result = "draw";
			System.out.println("무승부");
		}else {									//지는 경우
			result = "lose";
			System.out.println("패배");
		}
		
		System.out.println(result);
		System.out.println("나 : " + items[result_me] + " vs " + "컴 : " + items[com]);
	}

}
