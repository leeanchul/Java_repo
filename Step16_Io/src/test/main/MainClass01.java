package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입력,출력(Input,Output)
 * 
 * -어떤 대상으로 부터 데이터를 메모리로 읽어 들이는 것을 입력이라고 한다.
 * -프로그래밍 언어의 관점에서 메모리라는 것은 벼수 or 필드 or 객체 로 생각하면 편하다
 * -데이터는 2진수로 이루어져 있지만 2진수 8개의 묶으만 1byte 단위로 생각ㅎ면 편하다
 * -1byte 는 총 256가지의 값을 표현할수 있다.
 * -1 byte 를 10진수로 한산하면 0~256 사이의 숫자중에 하나이다.
 * -입력과 출력을 통해서 이동하는 데이터는 byte(byte알갱이) 하나 하나가 이동한다고 생각하면된다.*/

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//키보드아 연결된 InputStream tyep 의 참조값을 kbd 라는 지역변수에 담기
		//InputStream 객체는 1byte 단위 스트림 이다.
		//영문자 대소문자 , 숫자 ,특수문자만 처리할수 있다.
		//한글 처리 불가
		InputStream kbd=System.in;
		
		try {
			System.out.print("입력해라");
			int code=kbd.read();
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
