package test.main;
<<<<<<< HEAD

import test.mypac.Marine;

public class MainClass07 {
	
	public static void main(String[] args) {
		/*
		 *  Marine 객체를 생성해서 참조값을 m1 이라는 지역 변수에 담아 보세요.
		 */
		Marine m1=new Marine();
		m1.move();
		m1.attack();
		m1.showEnergy();
		System.out.println("--- m1 ---");
		
		Marine m2=new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("--- m2 ---");
		
		//Marine 의 공격력을 올려보자 (모든 Marine 객체의 공격력에 영향을 미친다)
		Marine.attackPower += 2;
		m1.attack();
		m2.attack();
		
		//m1 의 에너지 감소 시키기 (m2 의 에너지에는 영향을 주지 않는다)
		m1.energy -= 10;
		m1.showEnergy();
		m2.showEnergy();
	}
}








=======
/*
 * 접근지정자
 * 
 * 클래스, 필드, 메소드에 작성한다.
 * 
 * 1. public - 어디에서나 자유롭게 접근 가능
 * 2. default - 접근 지정자를 작성하지 않은 경우
 * 				- 동일한 package 내에서만 접근 가능
 * 				- package 가 다르면 import 도 불가능
 * 
 * 
 * 3. private	- 해당 클래스에서만 접근 가능
 * 4. protected	-
 * 
 */
import test.mypac.Marine;

public class MainClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Marine 객체를 생성해서 참조 값을 m1이라는 지역변수에 담아보세요
		 */
		Marine m1 = new Marine();
		m1.move();
		m1.attack();
		m1.showEnergy();
		
		System.out.println("--- m1 ---");
		Marine m2 = new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("--- m2 ---");
		
		//마린의 공격력을 올려보자 ( 모든 마린객체에 영향을 미친다 ) -> 스태틱 필드
		Marine.attackPower +=2;
		m1.attack();
		m2.attack();
		
		//m1의 에너지 감소 시키기 (m2의 에너지에는 영향을 주지 않는다.) -> non 스태틱 필드
		m1.energy -= 10;
		m1.showEnergy();
		m2.showEnergy();
	}

}
>>>>>>> refs/heads/study
