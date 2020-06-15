package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;

public class Frame05 extends JFrame implements ActionListener {
	//필드
	JLabel label_result;
	
	//내부클래스
	class CountThread extends Thread{
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
				/*
				 * 내부 클래스의 메소드 안에서 바깥쪽에 클래스의 필드와 메소드를 사용할 수 있다.
				 */
				label_result.setText(""+count);
			}
		}//run()
	}//class CountThread
	
	//생성자
	public Frame05() {
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
		
		//JLabel
		label_result = new JLabel();
		panel.add(label_result);
	}

	// main Thread
	public static void main(String[] args) {
		Frame05 frame = new Frame05();
		frame.setTitle("Frame06");
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
		//내부 클래스를 이용해서 스레드 객체를 생성해서 시작 시칸다.
		new CountThread().start();
	}
}
