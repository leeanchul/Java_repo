package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream is=System.in;
		//2byte 처리 스트림
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("문자열 한줄 입력:");
		try {
			String line=br.readLine();
			System.out.println("line:"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
