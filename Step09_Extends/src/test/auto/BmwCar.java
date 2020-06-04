package test.auto;

public class BmwCar extends Car{

	public BmwCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		System.out.println("bmw가 달려요");
	}

}
