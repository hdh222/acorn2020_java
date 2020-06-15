package test.main;

import java.io.File;

public class MainClass08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("c:/");
		
		//파일객체 목록(File[])을 얻어내기
		File[] f = myFile.listFiles();
		
		//반복문 돌면서 하나씩 참조해서 작업해보기
		for(File tmp : f) {
			if(tmp.isDirectory()) {
				System.out.println("[" + tmp.getName() + "]");
			}else {
				System.out.println(tmp.getName());
			}
		}
	}

}
