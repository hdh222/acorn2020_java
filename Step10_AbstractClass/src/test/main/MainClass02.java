package test.main;

import test.mypac.Sword;
import test.mypac.Weapon;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon w2 = new Sword();
		MainClass02.useWeapon(w2);
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
