package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;

public class Frame02 extends JFrame implements ActionListener {

	public Frame02() {
		// 레이아웃설정
		setLayout(new BorderLayout());

		// 패널을 프레임의 상단에 배치
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		add(panel, BorderLayout.NORTH);

		// 버튼을 패널에 추가하고
		JButton countBtn = new JButton("알림 띄우기");
		panel.add(countBtn);

		// 버튼에 리스너 등록하기
		countBtn.addActionListener(this);
	}

	// main Thread
	public static void main(String[] args) {
		Frame02 frame = new Frame02();
		frame.setTitle("Frame02");
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
		CountThread ct1 = new CountThread();
		
		ct1.start();		//스레드를 동작시키는 메소드
		System.out.println("새로운 스레드를 시작합니다.");

	}
}
//시간이 오래걸리거나 불확실한 자료를 작업할 때 스레드를 사용한다.
