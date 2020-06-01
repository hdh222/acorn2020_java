package test.mypac;

public class Messenger {
	
	//String type을 인자로 전달받는 static 메소드
	public static void SendMessage(String msg) {
		System.out.println(msg + "를 전송합니다.");
	}
	
	//String type을 리턴하는 static 메소드
	public static String getMessage() {
		return "hello";
	}
	
	//Car type 을 인자로 전달받는 static 메소드
	public static void useCar(Car c) {
		c.drive();
	}
}
