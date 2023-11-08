package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass07 {

	public static void main(String[] args) {
		File f=new File("C:/acorn202310/myFolder/memo.txt");
		
		//File 객체의 메소드를 활용해서
		//실제 mem.txt. 파일이 존재하지 않으면 파일을 만들고
		//존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보세요
		
		
		  try {
			  
			  if(f.exists()) {
				  f.delete();
				  System.out.println("memo.txt 파일을 삭제했습니다.");
			  }else {
			  	f.createNewFile();
			  	 System.out.println("memo.txt 파일을 만들었습니다");
			  }
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		  System.out.println("g1");
		 
		
	}

}
