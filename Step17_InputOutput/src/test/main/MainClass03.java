package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		//한 번에 여러글자를 읽어들여서 String type으로 리턴해주는 기능을 가지고 있는 객체
		BufferedReader br = new BufferedReader(isr);
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("입력  : " );
			
			//입력한 문자열 한줄 얻어내기
			String line = br.readLine();
			
			//출력
			System.out.println("line : " + line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
