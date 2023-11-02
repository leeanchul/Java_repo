package test.main;

import tset.util.MyUtil;

public class MainClass10 {

	public static void main(String[] args) {
		//상속 받은 BaseUtil 클래스에 정의된 static 메소드도 사용가능.
		MyUtil.clear();
		MyUtil.send();
		MyUtil.light();
	}

}
