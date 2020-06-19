package example2;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		//서버에 전송할 문자열을 입력받아서
		Scanner scan = new Scanner(System.in);
		System.out.println("전송할 문자열 입력 : ");
		String msg = scan.nextLine();
		
		Socket socket = null;
		
		try {
			//192.168.0.6
			socket = new Socket("192.168.0.30", 5000);
			System.out.println("Socket 연결 성공!");
			
			//문자열을 서버에 전송(출력 Output) 하기
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write(msg);
			osw.write("\r\n");
			osw.flush();
			osw.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			try {
				if(socket != null) socket.close();
			}catch(Exception e) {
				
			}
		}
		System.out.println("종료됩니다.");
	}
}
