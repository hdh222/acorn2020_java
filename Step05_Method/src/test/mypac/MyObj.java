package test.mypac;

public class MyObj {
	public int number;
	public String name;
	public String addr;
	
	public void move() {
		System.out.println("움직인다.");
	}
	
	public void carBrand(String brand) {
		System.out.println("내 자동차 브랜드 : "+brand);
	}
	
	public void myAge(int age) {
		System.out.println("내 나이 : " + age);
	}
	
	public void car(Car car) {
		System.out.println("Car : " + car);
	}
	
	public Car makeCar() {
		return new Car();
	}
	
	public void info(int age, Car car) {
		System.out.println("나이 : " + age);
		car.drive();
	}
	
	public int sum(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public double avg(int num1, int num2) {
		
		return num1 / (double)num2;
	}
	
	public String msg(String str1, String str2) {
		
		return str1 + str2;
	}
	
	public static void hello() {
		System.out.println("hello");
	}
}
