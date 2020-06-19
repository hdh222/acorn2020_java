package example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;		//

		try {
			// 5000번 port를 열고 클라이언트의 접속을 기다린다.
			serverSocket = new ServerSocket(5000);
			/*
			 * accept() 메소드는 클라이언트가 실제 접속을 할 때까지 리턴하지 않고 블록킹되는 메소드이다. 클라이언트가 접속을 해오면 Socket
			 * 객체의 참조값을 반환하면서 리턴된다.
			 * 
			 */
			while(true) {
				System.out.println("클라이언트의 Socket 연결 요청을 대기");
				Socket socket = serverSocket.accept();
				serverSocket.accept();
				System.out.println("클라이언트가 접속을 했습니다.");
				
				String clientIp = socket.getInetAddress().getHostAddress();
				System.out.println("접속한 클라이언트의 ip : " + clientIp);
				
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String msg = br.readLine();
				System.out.println("메세지 : "+ msg);
				socket.close();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null)
					serverSocket.close();
			} catch (Exception e) {

			}
		}

	}
}
