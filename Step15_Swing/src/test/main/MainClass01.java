package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		//JFrame 객체 생성
		JFrame f = new JFrame("Hello");
		
		//초기 위치와 크기 지정
		f.setBounds(100, 100, 500, 500);
		
		//프레임을 닫았을 때 자동으로 프로세스 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//프레임이 보이도록한다.
		f.setVisible(true);
		
		//레이아웃 매니저를 사용하지 않도록 설정
		f.setLayout(null);
		
		JButton btn = new JButton("눌러봐");
		btn.setBounds(10, 10, 100, 40);
		//프레임에 버튼 추가하기
		f.add(btn);
		
		new MyFrame("나만의 프레임");
	}
	public static class MyFrame extends JFrame{
		//생성자
		public MyFrame(String title) {
			super(title);
			
			//초기화 작업
			//JFrame을 상속 받았기 때문에 JFrame.으로 접근을 안해도 된다.
			
			setBounds(200, 200, 500, 500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setLayout(null);
			JButton btn = new JButton("눌러봐");
			btn.setBounds(10, 10, 400, 100);
			add(btn);
		}
	}
}
