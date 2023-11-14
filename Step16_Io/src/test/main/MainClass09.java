package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass09 {
	
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//파일에서 byte 를 읽어 들일때 사용하는 객체  
			fis=new FileInputStream("c:/acorn202310/myFolder/01_iron_man_2.jpg");
			//byte 를 파일에 출력할때 사용하는 객체
			fos=new FileOutputStream("c:\\acorn202310\\myFolder\\copied2.jpg");
			//byte 알갱이를 읽어낼 배열을 미리 준비하기
			byte[] buffer=new byte[1024];
			
			//반복문 돌면서 
			while(true) {
				//byte[]배열을 전달해서 byte 알갱이를 한번에 1024 개씩 읽어들인다.
				int readedCount=fis.read(buffer);//읽어들인 갯수가리턴된다.
				System.out.println(readedCount+"b 를 읽었습ㄴ디ㅏ");
				if(readedCount==-1)break; //더이상 읽을 데이터가 없다면 반복문 탈출
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(fos!=null)fos.close();
			if(fis!=null)fis.close();
			}catch (Exception e) {}
		}
	}
}
