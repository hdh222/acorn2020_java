package test.main;

import test.mypac.Car;
import test.mypac.Messenger;
import test.mypac.MyObj;

public class MainClass06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String msg = Messenger.getMessage();
		System.out.println(msg);
		Messenger.SendMessage("hi");
		Messenger.useCar(new Car());
		MyObj.hello();
	}

}
