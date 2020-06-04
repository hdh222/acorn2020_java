package test.auto;

public class KiaCar extends Car{

	public KiaCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		System.out.println("카니발이 달려요");
	}

}
