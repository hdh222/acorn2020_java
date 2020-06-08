package test.main;
/*
 *  클래스 안에 만든 클래스 : inner Class
 *  메소드안에 만든 클래스 : local inner class
 */
public class MainClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Gura{
			public void say() {
				System.out.println("안녕 나는 김구라야");
			}
		}
		
		//메소드 안에 정의한 클래스를 이용해서 객체 생성하고 참조 값을 지역변수에 담기
		Gura g1 = new Gura();
		g1.say();
	}

}
