package test.frame9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener,KeyListener{
	JTextField inputMsg;
	JLabel lab1;
	//생성자
	public MyFrame() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//문자열 한 줄을 입력할 수 있는 JTextField
		inputMsg = new JTextField(10);	//10개의 칼럼
		add(inputMsg);
		
		JButton sendBtn = new JButton("전송");
		
		sendBtn.addActionListener(this);
		
		
		add(sendBtn);
		
		lab1 = new JLabel("lab1");
		add(lab1);
		inputMsg.addKeyListener(this);
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
		String msg = inputMsg.getText();
		lab1.setText(msg);
		inputMsg.setText("");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == e.VK_ENTER) {
			String msg = inputMsg.getText();
			lab1.setText(msg);
			inputMsg.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
