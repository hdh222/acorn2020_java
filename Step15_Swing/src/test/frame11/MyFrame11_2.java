package test.frame11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame11_2 extends JFrame implements ActionListener{
	JTextField tf_num1,tf_num2;
	JLabel label1, label_result;

	public MyFrame11_2() {
		setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.yellow);
		
		add(topPanel, BorderLayout.NORTH);
		
		tf_num1 = new JTextField(10);
		topPanel.add(tf_num1);
		
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiBtn = new JButton("*");
		JButton divideBtn = new JButton("/");

		topPanel.add(plusBtn);
		topPanel.add(minusBtn);
		topPanel.add(multiBtn);
		topPanel.add(divideBtn);
		
		tf_num2 = new JTextField(10);
		topPanel.add(tf_num2);
		
		label1 = new JLabel("=");
		label_result = new JLabel("0");
		
		topPanel.add(label1);
		topPanel.add(label_result);
		
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		plusBtn.setActionCommand("plus");
		plusBtn.setActionCommand("minus");
		plusBtn.setActionCommand("multi");
		plusBtn.setActionCommand("divide");
	}
	
	public static void main(String[] args) {
		MyFrame11_2 frame  = new MyFrame11_2();
		frame.setTitle("계산기");
		
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100, 100, 550, 500);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		double num1 = Double.parseDouble(tf_num1.getText());
		double num2 = Double.parseDouble(tf_num2.getText());
		
		double result = 0;
		if(command.equals("plus")) {
			result = num1 + num2;
		}else if(command.equals("minus")) {
			result = num1 - num2;
		}else if(command.equals("multi")) {
			result = num1 * num2;
		}else if(command.equals("divide")) {
			result = num1 / num2;
		}
		label_result.setText(Double.toString(result));
	}
}
