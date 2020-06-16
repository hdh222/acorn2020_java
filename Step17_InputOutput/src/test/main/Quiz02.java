package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener {
	JTextField tf_msg;
	JTextArea ta;
	// 생성자
	public Quiz02() {
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		JPanel bodyPanel = new JPanel();
		
		tf_msg = new JTextField(10);
		JButton appendBtn = new JButton("추가하기");
		JButton loadBtn = new JButton("불러오기");
		
		ta = new JTextArea(40,40);
		ta.setBackground(Color.white);
		
		
		
		loadBtn.setActionCommand("load");
		appendBtn.setActionCommand("append");

		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		topPanel.add(loadBtn);
		bodyPanel.add(ta);

		add(topPanel, BorderLayout.NORTH);
		add(bodyPanel, BorderLayout.CENTER);
		
		topPanel.setBackground(Color.YELLOW);

		appendBtn.addActionListener(this);
		loadBtn.addActionListener(this);

	}

	public static void main(String[] args) {
		Quiz02 f = new Quiz02();
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		File file = new File("c:/acorn2020/myFolder/memo.txt");
		if (e.getActionCommand().equals("append")) {
			FileWriter fw = null;
			try {
				boolean isExist = file.exists();
				if (!isExist) {
					file.createNewFile();
				}
				fw = new FileWriter(file, true);
				String msg = tf_msg.getText();
				fw.append(msg);
				fw.append("\r\n");
				tf_msg.setText("");
				JOptionPane.showMessageDialog(this, "저장했습니다.");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}else if(e.getActionCommand().equals("load")) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				if(!file.exists()) {
					System.out.println("파일이 존재하지 않습니다.");
					return ;
				}
				//파일에서 문자열 읽어들이는 객체의 참조값을 미리 만들어둔 지역변수에 담는다.
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while(true) {
					//반복문 돌면서 문자열을 줄단위로 읽어낸다.
					String line = br.readLine();
					if(line == null) {	//더이상 읽을 문자열이 없으면
						break;	//반복문 탈출
					}
					System.out.println(line);
					ta.append(line);
					ta.append("\r\n");
				}
			}catch(IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
	
}
