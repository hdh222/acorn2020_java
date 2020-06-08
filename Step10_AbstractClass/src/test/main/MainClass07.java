package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	
	//run했을 때 실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		/*
		 * Weapon 추상 클래스를 상속받은 익명의 local inner class의 생성자를 호출해서
		 * Weapon Type의 참조 값을 얻어내서 지역변수 w1에 담기
		 */
		Weapon w1 = new Weapon(){
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("아무나 공격해요");
			}
		};
		
		Weapon w2 = new Weapon( ) {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("공중 공격을 해요");
			}
		};
		useWeapon(w1);
		useWeapon(w2);
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("지상 공격을 해요");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}

//생성자 옆에 괄호는 이름이 없는 Weapon 추상클래스를 상속받은 클래스이다.
//Anonymous local inner class