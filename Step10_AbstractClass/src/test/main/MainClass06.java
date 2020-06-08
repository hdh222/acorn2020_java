package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	
	//static inner class 로 Weapon 추상 클래스 상속 받기
	public static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("아무나 공격해요");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * useWeapon()메소드를 호출하는게 목적이다.
		 * 호출하려고 보니 Weapon 추상 클래스 type 객체의 참조 값이 필요하다.
		 * 따라서 Weapon 추상 클래스를 상속받은 클래스를 파일로 만들어야 된다.
		 * 클래스를 파일로 만들지 않고 내부클래스(inner class)로 만들고 싶다.
		 * 
		 */
		Weapon w1 = new YourWeapon();
		MainClass06.useWeapon(w1);
		
		//local inner class도 이용해보자
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("지겹다 그만 공격하자");
			}
			
		}
		Weapon w2 = new OurWeapon();
		useWeapon(w2);
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}

//메소드안에서 클래스를 쓰고 버릴거면 메소드 안에서도 클래스를 정의할 수 있다. (local class)
//클래스안에서 다른클래스를 정의할 수 있다.							
//