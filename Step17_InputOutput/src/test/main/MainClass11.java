package test.main;

import java.io.File;

public class MainClass11 {
	public static void main(String[] args) {
		//c:/acorn2020/myFolder에 있는 모든내용 삭제하기
		
		//c:/acorn2020/myFolder 에 access 할 수 있는 객체 생성
		File f1 = new File("c:/acorn2020/myFolder");
		
		//File[] 객체 얻어내기
		File[] f2 = f1.listFiles();
		
		//반복문돌면서 삭제
		for(File tmp:f2) {
			tmp.delete();
		}
		System.out.println("모두 삭제되었습니다.");
	}
}