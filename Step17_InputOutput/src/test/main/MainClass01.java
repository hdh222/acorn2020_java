package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드와 연결된 InputStream 타입의 참조값을 kbd 라는 지역변수에 담기
		//inputstream 객체는 1byte단위 처리 스트림이다.
		//영문자 대소문자, 숫자, 특수문자만 처리할 수 있다.
		//한글 처리 불가
		InputStream kbd = System.in;
		System.out.println("입력 : ");
		try {
			int code = kbd.read();
			System.out.println("code :" +code);
			
			//코드값에 대응되는 문자 얻어내기
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
