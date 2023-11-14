package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		
	
		PrintStream ps=System.out;
		OutputStream os=ps;
		
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("안녕하세요!\n 촐랑입니다.");
			bw.newLine();
			bw.write("gg!\n 바이바이`");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
