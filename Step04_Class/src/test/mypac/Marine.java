package test.mypac;

public class Marine {
	public static int attackPower = 6;			//공격력을 저장하고 있는 static 필드
	public int energy = 40;						//에너지를 저장하고 있는 non static필드
	
	//움직이는 메소드
	public void move() {
		System.out.println("마린이 움직이다.");
	}
	
	public void attack() {
		System.out.println(Marine.attackPower + "의 공격력으로 공격을해요");
	}
	
	//현재 에너지를 출력하는 메소드
	public void showEnergy() {
		System.out.println("현재 에너지 : " + this.energy);
	}
}
