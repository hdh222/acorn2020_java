package example3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientMain extends JFrame implements ActionListener{
	JTextField tf_msg;
	//서버와 연결된 Socket 객체의 참조값을 담을 필드
	Socket socket;
	
	//생성자
	public ClientMain() {
		//서버에 소켓접속을 한다.
		try {
			socket = new Socket("192.168.0.30",5000);
		}catch(Exception e) {
			
		}
		
		//레이아웃을 BorderLayout으로 지정
		setLayout(new BorderLayout());
		
		//패널
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		//입력창
		tf_msg = new JTextField(10);
		
		//버튼
		JButton sendBtn = new JButton("전송");
		sendBtn.setActionCommand("send");
		sendBtn.addActionListener(this);
		
		 panel.add(tf_msg);
		 panel.add(sendBtn);
		 
		 add(panel, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		
		ClientMain f = new ClientMain();
		f.setTitle("채팅창");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if(command.equals("send")) {
			String msg = tf_msg.getText();
			try {
				
				System.out.println("Socket 연결 성공!");
				
				//문자열을 서버에 전송(출력 Output) 하기
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				osw.write(msg);
				osw.write("\r\n");
				osw.flush();
			}catch(Exception e1){
				e1.printStackTrace();
				
			}finally {
				try {
					if(socket != null) socket.close();
				}catch(Exception e1) {
					
				}
			}
			System.out.println("종료됩니다.");
		}
		
	}
	
}
