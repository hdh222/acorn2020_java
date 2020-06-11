package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			//send() 메소드에서 발생하는 exception을 처리해야한다.
			MyUtil.send();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
