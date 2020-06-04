package test.auto;

public class Car {
	// 필드
	protected Engine engine;

	// 생성자
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		if (engine == null) {
			System.out.println("Engine객체가 없어서 달릴 수 없어요");
			return;
		}
		System.out.println("달려요");
	}
}
