package test.frame10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener,KeyListener{
	JTextField inputMsg;
	JLabel lab1;
	DefaultListModel<String> model;
	JList<String> list;
	
	//static final 상수
	static final String COMMAND_SEND = "send";
	static final String COMMAND_REMOVE = "remove";
	
	//생성자
	public MyFrame() {
		setLayout(new BorderLayout());
		
		//문자열 한 줄을 입력할 수 있는 JTextField
		inputMsg = new JTextField(10);	//10개의 칼럼
		inputMsg.addKeyListener(this);
		
		JButton sendBtn = new JButton("전송");
		sendBtn.addActionListener(this);
		
		JButton removeBtn = new JButton("삭제");
		removeBtn.addActionListener(this);
		
		sendBtn.setActionCommand(COMMAND_SEND);
		removeBtn.setActionCommand(COMMAND_REMOVE);
	
		lab1 = new JLabel("lab1");

		//JPanel 객체 생성
		JPanel panel = new JPanel();
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//JPanel 에 UI추가
		panel.add(inputMsg);
		panel.add(sendBtn);
		panel.add(lab1);
		
		//JFrame 에 JPanel을 북쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		
		//기본모델객체(목록에 출력할 data를 가지고 있는 객체)
		list  = new JList<String>();
		model = new DefaultListModel<String>();
		model.addElement("김구라");
		model.addElement("해골");
		model.addElement("원숭이");
		
		//목록에 모델 연결하기
		list.setModel(model);
		
		//스크롤 패널
		JScrollPane sc = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
													JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sc.setPreferredSize(new Dimension(500,300));
		
		add(sc, BorderLayout.CENTER);
		
		
		add(removeBtn, BorderLayout.SOUTH);
		//목록을 프레ㅔ임의 가운데에 배치하기
		//add(list, BorderLayout.CENTER);
		
		
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
		if(e.getActionCommand().equals(COMMAND_SEND)) {
			send();
		}else if(e.getActionCommand().equals(COMMAND_REMOVE)) {
			int result = JOptionPane.showConfirmDialog(this, "삭제할거야?");
			if(result == JOptionPane.YES_OPTION) {
				remove();
			}else {
				
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == e.VK_ENTER) {
			send();
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
	
	public void send() {
		String msg = inputMsg.getText();
		lab1.setText(msg);
		inputMsg.setText("");
		model.addElement(msg);
	}
	public void remove() {
		int idx = list.getSelectedIndex();
		model.remove(idx);
	}
}
