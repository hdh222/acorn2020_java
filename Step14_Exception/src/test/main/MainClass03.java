package test.main;import java.io.File;
import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f1 = new File("c:/acorn2020/myFolder/test.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드를 종료합니다.");
	}
	
}
