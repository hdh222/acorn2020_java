package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1 = new File("c:/acorn2020/myFolder/folder1");
		
		f1.mkdir();
		System.out.println("디렉토리를 만들었습니다.");
		
		for(int i = 0; i < 10; i++) {
			File tmp = new File("c:/acorn2020/myFolder/folder_" + i);
			tmp.mkdir();
		}
	}
}