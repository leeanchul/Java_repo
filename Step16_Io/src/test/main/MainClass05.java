package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream 객체를 부모type OutputStream 으로 받아보기
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os=ps;
		//2byte 처리 스트림
		OutputStreamWriter osr=new OutputStreamWriter(os);
		try {
			osr.write(44032);
			osr.write("야금");
			osr.write("\n");
			osr.write("메롱");
			osr.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
