package test.frame11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.frame5.MyFrame;

public class MyFrame11 extends JFrame implements ActionListener{
	JTextField inputNum1;
	JTextField inputNum2;
	JLabel lab2;
	
	public MyFrame11() {
		
		inputNum1 = new JTextField(10);
		inputNum2 = new JTextField(10);
		
		JButton sum = new JButton("+");
		JButton sub = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		
		JLabel lab1 = new JLabel("=");
		lab2 = new JLabel();
		
		//레이아웃설정
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//UI추가
		add(inputNum1);
		
		add(sum);
		add(sub);
		add(mul);
		add(div);
		
		add(inputNum2);
		
		add(lab1);
		
		add(lab2);
		
		//ActionListener등록
		sum.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		//ActionCommand설정
		sum.setActionCommand("sum");
		sub.setActionCommand("sub");
		mul.setActionCommand("mul");
		div.setActionCommand("div");
		
	}
	public static void main(String[] args) {
		MyFrame11 frame = new MyFrame11();
		//프레임 제목 설정
		frame.setTitle("나의 프레임");
		//프레임을 닫으면 자동으로 프로세스가 종료되도록 한다.
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100, 100, 550, 500);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String command = arg0.getActionCommand();
		
		if(command.equals("sum")) {
			double result = sum();
			lab2.setText(Double.toString(result));
		}else if(command.equals("sub")) {
			double result = sub();
			lab2.setText(Double.toString(result));
		}else if(command.equals("mul")) {
			double result = mul();
			lab2.setText(Double.toString(result));
		}else {
			double result = div();
			lab2.setText(Double.toString(result));
		}
	}
	public double sum() {	//덧셈의 결과 값을 구하는 함수
		double result = 0;
		try {
			double num1 = Double.parseDouble(inputNum1.getText());
			double num2 = Double.parseDouble(inputNum2.getText());
			result = num1 + num2;
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못입력하셨습니다.");
		}
		return result;
	}
	
	public double sub() {	// 뺄셈의 결과 값 구하는 함수
		double result = 0;
		try {
			double num1 = Double.parseDouble(inputNum1.getText());
			double num2 = Double.parseDouble(inputNum2.getText());
			result = num1 - num2;
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못입력하셨습니다.");
		}
		return result;
	}
	
	public double mul() {	//곱셈의 결과 값 구하는 함수
		double result = 0;
		try {
			double num1 = Double.parseDouble(inputNum1.getText());
			double num2 = Double.parseDouble(inputNum2.getText());
			result = num1 * num2;
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못입력하셨습니다.");
		}
		return result;
	
	}
	
	public double div() { //나눗셈의 결과 값(몫)을 구하는 함수
		double result = 0;
		try {
			double num1 = Double.parseDouble(inputNum1.getText());
			double num2 = Double.parseDouble(inputNum2.getText());
			result = num1 / num2;
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		return result;
	}
}
