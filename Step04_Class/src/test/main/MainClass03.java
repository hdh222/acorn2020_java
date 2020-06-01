package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;
import test.mypac.YourUtil;

public class MainClass03 {
<<<<<<< HEAD
	public static void main(String[] args) {
		//Car 객체를 생성해서 drive() 메소드 호출하기
		new Car().drive();
		
		//Car 객체를 생성해서 참조값을 car1 이라는 지역변수에 담기 
		Car car1=new Car();
		//car1 안에 들어 있는 참조값을 이용해서 drive() 메소드 호출하기 
		car1.drive();
		//Car 객체를 생성해서 참조값을 car2 라는 지역변수에 담기 
		Car car2=new Car();
		//car2 안에 들어 있는 참조값을 이용해서 drive() 메소드 호출하기 
		car2.drive();
		
		// MyUtil 클래스의 send() 라는 static 메소드 호출하기 
		MyUtil.send();
		// YourUtil 클래스의 up() 이라는 static 메소드 호출하기 
		YourUtil.up();
	}
}





=======

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car().drive();					//Car 객체를 생성해서 drive()호출

		Car car1 = new Car();				//Car 객체를 생성해서 참조값을 car1이라는 지역변수에 저장
		car1.drive();						//car1 안에 들어있는 참조 값을 이용해서 drive()메소드 호출
		
		Car car2 = new Car();				//Car 객체를 생성해서 참조값을 car2이라는 지역변수에 저장
		car2.drive();						//car2 안에 들어있는 참조 값을 이용해서 drive()메소드 호출
		
		MyUtil.send();						// MyUtil 클래스의 send() 라는 static 메소드 호출
		
		YourUtil.up();						//YourUtil 클래스의 up() 이라는 static 메소드 호출
	}

}
>>>>>>> refs/heads/study
