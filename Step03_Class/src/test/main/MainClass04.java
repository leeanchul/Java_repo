package test.main;

import test.mypac.Myutil;

public class MainClass04 {

	public static void main(String[] args) {
		//Myutil 클래스의 static 메소드 호출
		Myutil.send();
		//Myutil 클래스의 static 필드 참조
		String a=Myutil.version;
		
	}

}
