package test.frame6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	
	//생성자
	public MyFrame() {
		//MyFrame의 레이아웃 매니저 지정
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("전송");
		add(btn);
		
		JButton removeBtn = new JButton("삭제");
		add(removeBtn);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.out.println("전송합니다.");
					
					JOptionPane.showMessageDialog(MyFrame.this, "전송합니다."); //프레임의 참조값
			}
		};
		
		//람다식 활용하기
		ActionListener listener2 = (e)->{
				JOptionPane.showMessageDialog(MyFrame.this, "삭제됩니다.");
		};
		
		btn.addActionListener(listener);
		removeBtn.addActionListener(listener2);
		
	}
		
	public static void main(String[] args) {
		//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame에 담기
		MyFrame frame = new MyFrame();
		//프레임 제목 설정
		frame.setTitle("나의 프레임");
		//프레임을 닫으면 자동으로 프로세스가 종료되도록 한다.
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100, 100, 550, 500);
		frame.setVisible(true);
	}
}
