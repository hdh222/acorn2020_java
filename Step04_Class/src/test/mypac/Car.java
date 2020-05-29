package test.mypac;

/*
 * [클래스의 용도]
 * 
 * 1. 객체의 설계도 역할을 한다.
 * 2. 데이터 type의 역할을 한다.
 * 3. static 필드나 static 메소드를 가지고 있는 역할을한다.
 */
public class Car {
	public String name;						//자동차의 이름을 저장하는 필드
	
	public void drive() {					//달리는 메소드			
		System.out.println("달린다.");
	}
}
