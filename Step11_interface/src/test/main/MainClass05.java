package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		useDrill(new Drill() {		//드릴의 참조값전달
			
			@Override
			public void hole() {
				// TODO Auto-generated method stub
				System.out.println("바닥에 구멍을 뚫어요");
			}
		});
		
		//인터페이스 파일에 있는 메소드가 한 개 일 때 위의 코드를 아래와 같이 간략화가 가능하다.
		Drill d1 = ()->{
			System.out.println("벽에 20mm의 구멍내기");
		};
		useDrill(d1);
		useDrill(()->{
			System.out.println("핸드폰에 1mm의 구멍내기");
		});
	}
	public static void useDrill(Drill d) {
		d.hole();
	}
}
