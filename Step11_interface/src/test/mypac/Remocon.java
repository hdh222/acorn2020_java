package test.mypac;
/*
 * [interface]
 *  - 생성자가 없다.(단독 객체 생성 불가능)
 * 	- 구현된 메소드는 가질 수 없다(추상메소드만 가질 수 있다).
 *	- 필드는 static final 상수만 가질 수 있다.
 *	- data type의 역할을  할 수 있다.
 *	- interface type 의 참조 값이 필요하면 구현(implements) 클래스를 만들어서 객체를 생성해야 한다.
 *	- 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 *	- 단일상속이란 클래스 하나만 상속이 가능하다. class A extends B,C{}  <------ 불가능
 *	- 인터페이스는 다중 구현이 가능하다. class A implements B,C{} <------- 가능
 */
public interface Remocon {
	//필드(static final 생략 가능)
	public static final String COMPANY="LG";	
	
	//메소드(abstract) 생략 가능
	public abstract void up();
	public abstract void down();
}
//필드와 메소드를 정의할 수 있으나 제약이 있다.
// field -> static final
// method -> abstract method
// interface에서는 static final과 abstract를 생략가능하다.
// 