package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		//필요한 참조 값을 담을 지역변수를 미리만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//파일에서 byte를 읽어낼 객체
			fis = new FileInputStream("c:/acorn2020/myFolder/1.jpg");
			//읽어낸 byte를 출력할 객체
			fos = new FileOutputStream("c:/acorn2020/myFolder/copied2.jpg");
			
			//byte 데이터를 읽어낼 방 1024개 짜리 배열객체 생성
			byte[] buffer = new byte[1024];
			
			//반복문 돌면서 읽어내기
			while(true) {
				//byte[] 객체를 전달해서 읽어내고 리턴되는 데이터는 읽은 byte의 개수가 리턴된다.
				int readedByte = fis.read(buffer);
				System.out.println(readedByte);
				if(readedByte == -1) {
					break;
				}
				//byte[]에 있는 데이터를 읽은 만큼 출력하기
				fos.write(buffer, 0, readedByte);
				
			}
			System.out.println("파일을 성공적으로 복사했습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}