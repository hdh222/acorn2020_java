package test.main;

import test.mypac.CarInfo;
import test.mypac.Sedan;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan benz = new Sedan(new CarInfo("검은색","가솔린") , "카니발", "10.5~10.6 km/ℓ");
		
		benz.drive();
		benz.ornermodeon();
		benz.ornermodeoff();
		benz.parking();
		
		System.out.println(benz.getCarInfo().getColor());
	}

}
