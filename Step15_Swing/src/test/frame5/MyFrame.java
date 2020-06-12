package test.frame5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame() {
		//MyFrame의 레이아웃 매니저 지정
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("전송");
		JButton removeBtn = new JButton("삭제");
		
		//버튼
		add(btn);	
		add(removeBtn);
		
		//버튼에 command 등록하기 (어떤기능을 하는 버튼인지)
		btn.setActionCommand("send");
		removeBtn.setActionCommand("remove");
		
		//MyFrame 객체의 참조값을 전달해서 리스너 등록하기
		btn.addActionListener(this);
		removeBtn.addActionListener(this);
		
		//다형성
		ActionListener a = this;
		MyFrame b = this;
		JFrame c = this;
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
	
	//ActionListener 인터페이스를 구현해서 강제 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("send")) {
			System.out.println("전송");
			JOptionPane.showMessageDialog(this, "전송됨");
		}
		if(e.getActionCommand().equals("remove")) {
			System.out.println("삭제");
			JOptionPane.showMessageDialog(this, "삭제됨");
		}
		
	}
}
