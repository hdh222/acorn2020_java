package test.main;

import test.mypac.Drill;
import test.mypac.MultiPlayer;
import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//MultiPlayer 객체는 3가지 type모두 될 수 있기 때문에
		MultiPlayer mp = new MultiPlayer();
		
		//아래의 3개 메소드를 호출하면서 인자로 전달 할 수 있다.
		useRemocon(mp);
		useDrill(mp);
		useMultiPlayer(mp);
		
		
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	public static void useDrill(Drill d) {
		d.hole();
	}
	
	public static void useMultiPlayer(MultiPlayer mp) {
		mp.up();
		mp.down();
		mp.hole();
	}

}
