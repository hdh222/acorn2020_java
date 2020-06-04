package test.mypac;

public class Phone extends Object{				//extends Object 생략가능
	
	public Phone() {
		System.out.println("Phone()생성자 호출");
	}
	
	//전화거는 메소드
	public void call() {
		System.out.println("전화");
	}
}
