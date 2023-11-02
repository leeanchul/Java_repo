package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {

	public static void main(String[] args) {
		//AndroidPhone 객체를 생성해서 참조값을 AndroidPhone type p1 이라는 지역변수에 담기
		
		AndroidPhone p1=new AndroidPhone();
		p1.call();
		p1.mobilecall();
		p1.takePicture();
		p1.doInternet();
	}

}
