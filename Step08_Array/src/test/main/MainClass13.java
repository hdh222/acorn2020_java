package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 컴퓨터와 가위바위보 가위(s) 바위(r) 보(p)
		 * 
		 * 나 : 가위 vs 컴 : 보 win~
		 */
		String[] computer = { "s", "r", "p" };
		System.out.print("가위(s) 바위(r) 보(p) 종료(q) : ");

		Scanner scan = new Scanner(System.in);
		while(true) {
			String str = scan.nextLine();
			Random ran = new Random();
			int number = ran.nextInt(3);
			if(str.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
			if (str.equals("s")) {
				if (computer[number] == "s") {
					System.out.println("무승부");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				} else if (computer[number] == "r") {
					System.out.println("패배");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				} else {
					System.out.println("승리");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				}
			} else if (str.equals("r")) {
				if (computer[number] == "r") {
					System.out.println("무승부");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				} else if (computer[number] == "s") {
					System.out.println("승리");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				} else {
					System.out.println("패배");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				}

			} else if (str.equals("p")) {
				if (computer[number] == "p") {
					System.out.println("무승부");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				} else if (computer[number] == "r") {
					System.out.println("승리");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				} else {
					System.out.println("패배");
					System.out.println("나 : " + str + "컴퓨터 : " + computer[number]);
				}
			} else {
				System.out.println("잘못냈습니다.");
			}

		}
	}
}
