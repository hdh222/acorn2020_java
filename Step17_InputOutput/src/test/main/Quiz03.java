package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Quiz03 extends JFrame implements ActionListener{
	JTextArea area;
	public Quiz03() {
		setTitle("나의 파일");
		setLayout(new BorderLayout());
		
		//메뉴 아이템 3개 만들기
		JMenuItem item_new = new JMenuItem("new");
		JMenuItem item_open = new JMenuItem("Open");
		JMenuItem item_save = new JMenuItem("Save");
		
		item_new.setActionCommand("New");
		item_new.addActionListener(this);
		
		item_open.setActionCommand("Open");
		item_open.addActionListener(this);
		
		item_save.setActionCommand("Save");
		item_save.addActionListener(this);
		
		//메뉴에 아이템 추가
		JMenu menu1 = new JMenu("File");
		menu1.add(item_new);
		menu1.add(item_open);
		menu1.add(item_save);
		
		//메뉴바에 메뉴 추가
		JMenuBar mb = new JMenuBar();
		mb.add(menu1);
		
		//프레임에 메뉴바 장착
		setJMenuBar(mb);
		
		area = new JTextArea();
		add(area, BorderLayout.CENTER);
		area.setBackground(Color.yellow);
		area.setVisible(false);
	}
	public static void main(String[] args) {
		Quiz03 f = new Quiz03();
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getActionCommand().equals("Open")) {
			area.setVisible(true);
			JFileChooser fc = new JFileChooser("c:/acorn2020/myFolder");
			int result = fc.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				//선택한 파일을 access할 수 있는 파일 객체
				File selectedFile = new File(fc.getSelectedFile().getAbsolutePath());
				open(selectedFile);
			}else if(result == JFileChooser.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(this, "취소버튼누름");
			}else if(result == JFileChooser.ERROR_OPTION) {
				JOptionPane.showMessageDialog(this, "닫기버튼누름");
			}
		}else if(arg0.getActionCommand().equals("New")) {
			area.setText("");
			area.setVisible(true);
		}else if(arg0.getActionCommand().equals("Save")) {
			FileWriter fw = null;
			try {
				fw = new FileWriter("c:/acorn2020/myFolder/save_file");
				String str = area.getText();
				fw.write(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public void open(File file) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				area.append(str);
				area.append("\r\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
