package test.main;

import test.mypac.Weapon;

public class MainClass08 {
	//클래스의 필드에 Weapon type의 참조 값 넣어두기
	static Weapon w1 = new Weapon() {
		
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("필드에도 들어가네요");
		}
	};
	//run했을 때 실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		//필드에 저장된 Weapon type의 참조값을 이용해서 useWeapon()메소드 호출하기
		useWeapon(w1);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}

//생성자 옆에 괄호는 이름이 없는 Weapon 추상클래스를 상속받은 클래스이다.
//Anonymous local inner class