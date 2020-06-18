package test.main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		setBounds(100, 10, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton btn = new JButton("버튼1");
		btn.setSize(100,30);
		add(btn);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setSize(100,30);
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setSize(10,30);
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.setSize(100,30);
		add(btn4);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
