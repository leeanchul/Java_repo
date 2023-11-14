package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		//콘솔창으로 부터 입력 받은 문자열이라고 가정하자
		String msg="안녕하세요2333333";
		
		//파일을 만들거나 이미 만들어진 파일에 대해서 작업할 객체 생성
		File f=new File("C://acorn202310//myFolder/diary.txt");
		try {
		//파일이 이미있으면 출력
		if(f.exists()) {
			System.out.println("diary.txt 파일을 만들었습니다.!");
			}
		//파일에 문자열을 출력할 객체 생성
		FileWriter fw=new FileWriter(f,true);

		fw.write(msg);
		fw.write("\r\n");
		fw.flush();
		fw.close(); //마무리 해야 파일도 정상적으로 만들어지고 사용가능하고 자원 누수 방지한다.
		System.out.println("diary.txt 파일에 문자열을 기록 했습니다,");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
