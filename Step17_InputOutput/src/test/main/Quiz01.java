package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
//	public static void main(String[] args) {
//		/*
//		 * Scanner 객체를 이용해서 문자열 한 줄을 입력 받은 답음 c:/acorn2020/myFolder/quiz.txt 파일을 만들어서 해당
//		 * 파일에 문자열을 저장해보세요.
//		 */
//
//		try {
//			File f = new File("c:/acorn2020/myFolder/quiz.txt");
//			FileWriter fw = new FileWriter(f);
//			while (true) {
//				System.out.print("문자열을 입력하세요: ");
//				Scanner scan = new Scanner(System.in);
//				String str = scan.nextLine();
//				if (str.equals("q")) {
//					System.out.println("파일이 저장되었습니다.");
//					break;
//				}
//				boolean isExists = f.exists();
//
//				if (!isExists) {
//					f.createNewFile();
//				}
//
//				fw.write(str);		//덮어쓰는 함수 
//				fw.write("\r\n");
//			}
//			fw.flush();
//			fw.close(); // 자동 flush가 된다.
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 문자열 한 줄을 입력 받은 답음 c:/acorn2020/myFolder/quiz.txt 파일을 만들어서 해당
		 * 파일에 문자열을 저장해보세요.
		 */

		try {
			File f = new File("c:/acorn2020/myFolder/quiz.txt");
			FileWriter fw = new FileWriter(f, true);	//append를 할 때는 true도 같이 인자값에 넣어주어야 한다.

			System.out.print("문자열을 입력하세요: ");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();

			boolean isExists = f.exists();

			if (!isExists) {
				f.createNewFile();
			}

			fw.append(str); // 덧붙이는 함수 String type 과 CharCharSequence type 은 서로 같다.
			fw.append("\r\n");

			fw.flush();
			fw.close(); // 자동 flush가 된다.

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
