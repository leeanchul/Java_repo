package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args)  {
		MyUtil.draw();
		
		//메소드 안에서 발생하는 예외를 throw 한 draw() 메소드 호출
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
