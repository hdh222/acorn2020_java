package test.mypac;

public class Car {
	public String name;
	
	//생성자
	public Car(String name) {
		//생성자의 인자로 저날 받은 값을 필드에 저장
		this.name = name;
	}
	
	//메소드
	public void drive() {
		System.out.println(this.name + "이(가) 달려요");
	}
}
