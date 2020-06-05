package test.main;

import test.human.Blood;
import test.human.Man;

public class MainClass13 {
	public static void main(String[] args) {
		
		
		Man man = new Man( new Blood("-", "A") );
		/*
		 * Blood b1 = new Blood("-","A");
		 * Man man1 = new Man(b1);
		 * MainClass13.useMan(man1);
		 */
		MainClass13.useMan(man);
	}
	
	public static void useMan(Man m) {
		m.walk();
		m.study();
		m.seeMovie();
	}
}
