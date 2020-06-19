package example1;

import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//192.168.0.6
			socket = new Socket("192.168.0.30", 5000);
			
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
