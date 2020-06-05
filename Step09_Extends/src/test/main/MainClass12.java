package test.main;

import test.human.Blood;
import test.human.Woman;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적 독서를 하고싶다.
		 */
		
		Woman woman = new Woman(new Blood("+","O"));
		woman.reading();
		
		new Woman(new Blood("+","AB")).reading();
		
		Blood b1 = new Blood("-","B");
		Woman w1 = new Woman(b1);
		w1.reading();
	}
}
