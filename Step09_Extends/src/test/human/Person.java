package test.human;

public class Person {
	public Blood blood;
	
	public Person(Blood blood) {
		this.blood = blood;
	}
	
	public void walk() {
		System.out.println("걸어요");
	}
	
	public void study() {
		System.out.println("공부해요");
	}
}
