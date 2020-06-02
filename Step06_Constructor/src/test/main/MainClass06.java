package test.main;

import javax.swing.JFrame;

public class MainClass06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			JFrame f = new JFrame("김구라");		
			f.setTitle("JFrame");
			f.setBounds(100, 100, 500, 500);		//x좌표, y좌표, 폭, 높이
			f.setVisible(true);						//창이 화면에 보이도록 한다.
			f.setLocationRelativeTo(null);	//JFrame 가운데 정렬3
			
			//창을 닫았을 때 프로세스도 자동으로 종료되도록 한다.
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//상수는 final 이라는 예약어를 사용하여 만든다.
			//

		}

	}
}