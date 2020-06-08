package test.main;

import test.mypac.MyRemocon;
import test.mypac.Power;
import test.mypac.Remocon;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 type (부모type)
		Remocon r1 = new MyRemocon();
		useRemocon(r1);
		
		//원래 class type
		MyRemocon r2 = new MyRemocon();
		useRemocon(r2);
		
		Remocon r3 = new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("오른다");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("내린다.");
			}
		};
		
		useRemocon(r3);
		
		Power p1 = new MyRemocon();
		p1.on();
		
		Power p2 = new Power() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println("외부입력을 킨다.");
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println("외부입력을 끈다.");
			}
		};
		p2.on();
		p2.off();
		
		usePower(p1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
	public static void usePower(Power p) {
		p.on();
		p.off();
	}
}

//interface도 데이터타입의 역할을 할 수 있다.
