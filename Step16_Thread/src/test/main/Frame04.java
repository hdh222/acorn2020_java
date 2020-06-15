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

public class Frame04 extends JFrame implements ActionListener {

	public Frame04() {
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
		Frame04 frame = new Frame04();
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
		//Runnable 인터페이스를 구현한 클래스로 인스턴스 생성
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				
				int count = 0;

				while (true) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					count++; // count를 1증가 시킨다.
					System.out.println("현재 카운트 : " + count);
					if (count == 10) {
						break;
					}
				}
			}
		};
		//Thread 인스턴스 생성하면서 생성자의 인자로 전달
		Thread t = new Thread(r);
		//start() 메소드를 호출해서 새로운 스레드를 시작.
		t.start();
		System.out.println("새로운 스레드를 시작합니다.");
		
		new Thread(new CountRunnable()).start();
	}
}
//시간이 오래걸리거나 불확실한 자료를 작업할 때 스레드를 사용한다.
