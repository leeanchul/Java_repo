package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass04 {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		//OutputStream 도 1byte 처리 스트림이다. (한글 처리 불가)
		OutputStream os=ps;

		try {
			os.write(97);
			os.write(105);
			os.write(44032);
			os.flush();//방출
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
