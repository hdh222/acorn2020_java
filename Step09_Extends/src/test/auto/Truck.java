package test.auto;

public class Truck extends Car{

	//Engine 객체를 생성자의 인자로 전달받는 생성자
	//Car클래스의 생성자가 인자를 전달받게 정의되어 있다. 
	//기본생성자가 없을 경우 자식클래스에서 인자를 받아 부모클래스로 넘겨주어야 부모클래스가 먼저 생성될 수 있다. 
	public Truck(Engine engine) {
		//자식클래스로 받은 객체를 부모클래스에 전달해주어야 객체가 생성된다.
		super(engine);			//부모클래스를 가리킨다.
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	public void dump() {
		System.out.println("짐을 쏟아내요");
	}
}
/*
 * 
 * 
 */