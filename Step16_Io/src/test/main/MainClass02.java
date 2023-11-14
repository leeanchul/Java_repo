package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		
		System.out.print("입력:");
		
		try {
			int code=isr.read();
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("code:"+ch);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
