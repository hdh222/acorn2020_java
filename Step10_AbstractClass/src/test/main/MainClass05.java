package test.main;

public class MainClass05 {
	private static String yourName = "원숭이";
	public String myName="김구라";		//필드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(myName);		//myName 사용불가.
		System.out.println(new MainClass05().myName);		//myName 사용불가.
		
//		System.out.println(MainClass05.myName); 		//static이 붙어야지 클래스명으로 참조 가능
		System.out.println(new MainClass05().myName);
		
		System.out.println(MainClass05.yourName);		
		System.out.println(yourName);					//같은 클래스에 속해 있어 MainClass05가 생략가능
		
//		System.out.println(this.yourName);				
	}

}
//this는 static 영역에서는 의미가 없다. 
//this는 heap영역에서 나의 참조 값을 가리킬 떄 사용한다.
//**** static 메소드 안에서는 static자원들만 사용할 수 있다. ****