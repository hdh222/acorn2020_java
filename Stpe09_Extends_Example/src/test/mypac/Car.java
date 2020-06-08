package test.mypac;

public class Car {
	private CarInfo carInfo;
	
	public Car(CarInfo carInfo) {
		this.carInfo = carInfo;
	}
	
	public void drive() {
		System.out.println("운전을 해요");
	}
	
	public void parking() {
		System.out.println("주차를 해요");
	}
	public CarInfo getCarInfo() {
		return carInfo;
	}

}
