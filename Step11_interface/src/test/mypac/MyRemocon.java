package test.mypac;
/*
 * 인터페이스
 */
public class MyRemocon implements Remocon,Power{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("무언가를 올려요");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("무언가를 내려요");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("전원을 킨다.");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("전원을 끈다.");
	}
	

}
