package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frame01 extends JFrame implements ActionListener{
	
	public Frame01() {
		//레이아웃설정
		setLayout(new BorderLayout());
		
		//패널을 프레임의 상단에 배치
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		add(panel, BorderLayout.NORTH);
		
		//버튼을 패널에 추가하고
		JButton alertBtn = new JButton("알림 띄우기");
		panel.add(alertBtn);
		
		//버튼에 리스너 등록하기
		alertBtn.addActionListener(this);
	}
	
	//main Thread
	public static void main(String[] args) {
		Frame01 frame = new Frame01();
		frame.setTitle("Frame01");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		try {
			Thread.sleep(10000);
			System.out.println("10초동안 준비 작업을해요");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "알림");
		System.out.println("알림창이 닫아 졌습니다.");
		
		try {
			Thread.sleep(10000);
			System.out.println("10초동안 준비 작업을해요");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
//시간이 오래걸리거나 불확실한 자료를 작업할 때 스레드를 사용한다.

