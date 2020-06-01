package test.mypac;

/*
 *  [메소드를 만들 때 고려해야 하는 것]
 *  1. 접근 지정자
 *  2. 리턴 type	
 *  3. 메소드 명
 *  4. 메소드에 전달하는 인자의 개수와 데이터 type
 */

public class MyObject {

	/*
	 * public => 이 메소드는 어디에서든 접근 가능하다.
	 * void => 이 메소드는 어떤값도 리턴하지 않는다.
	 * wark => 메소드명
	 * walk() => 이 메소드는 어떤 값도 전달받지 않는다.
	 */

	public void walk() {
		System.out.println("걸음을 걸어요!");
	}

	//int type 을 리턴해주는 메소드
	public int getNumber() {

		int myNum = 10;
		//int type을 리턴해주어야 문법이 성립한다.
		return myNum;
	}

	//String type을 리턴해주는 메소드
	public String getString() {
		String greet = "안녕하세요";

		return greet;
	}

	//Car type 을 리턴해주는 메소드
	public Car getCar() {
		Car c1 = new Car();

		return c1;
	}

	//int type을 메소드의 인자로 전달받는 메소드
	public void setNum(int num) {
System.out.println("num : " + num);
	}
	//String type을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		System.out.println("name : " + name);
	}
	//String type을 메소드의 인자로 전달받는 메소드
	public void useCar(Car car) {
		car.drive();
		System.out.println("car : " + car);
	}

}
