package test.mypac;

public class SmartPhone implements Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("밀어서 전화받기");
	}

	@Override
	public int number() {
		// TODO Auto-generated method stub
		int num = 30;
		return num;
	}

}
