package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {

	//필드에 Remocon type
	static Remocon r3 = new Remocon() {
		
		@Override
		public void up() {
			System.out.println("물건을 올려요");
		}
		
		@Override
		public void down() {
			System.out.println("물건을 내려요");
			
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Remocon 인터페이스를 구현한 익명의 local inner class 의 생성자를 호출해서
		 *  참조 값을 얻어내고 Remocon type의 지역변수 r1에 대입하기
		 */
		
		MyRemocon r4 = new MyRemocon();
		useRemocon(r4);
		
		Remocon r1 = new Remocon() {
			@Override
			public void up() {		//상황에 맞게 무엇을 올릴지 정한다.
				// TODO Auto-generated method stub
				System.out.println("볼륨을 올린다.");
			}
			
			@Override
			public void down() {	//상황에 맞게 무엇을 내릴지 정한다.
				// TODO Auto-generated method stub
				System.out.println("볼륨을 내린다.");
			}
		};
		useRemocon(r1);
		
		
		//Anonymous inner type
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("채널을 올려요");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("채널을 내려요");
			}
		});
		
		useRemocon(r3);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}

//Remocon r1 = new remocon(){} --> class ? implements Remocon{}
