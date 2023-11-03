package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  Interface 로 data type 의 역활을 할수 있을까요?
		 * */
		Remocon r1=new MyRemocon();
		r1.up();
		r1.down();
		//Remotcon 인터페이스에 정의돈 static final 상수
		String result=Remocon.COMPANY;
		
		System.out.println(result);
		//변수는 필요시에 값 변경 가능
		int num=10;
		num=20;
		
		//상수는 값 변경 불가
		final int num2=10;
		//num2=20;
		
		final String name="안촐랑";
		//name="9ra킴";
		
	}
}
