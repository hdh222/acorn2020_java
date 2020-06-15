package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		
		//콘솔창에 출력할 수 있는 PrintStream 객체의 참조 값
		PrintStream ps = System.out;
		
		//학습을 위해서 PrintStream 객체를 부모 type OutputStream 으로 받아보기
		OutputStream os = ps;
		try {
			os.write(97);	//출력하기
			os.flush();		//출력된 내용 방출하기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
