package test.main;

import test.mypac.Test;
import test.mypac.AirPlane;

public class MainClass01 {

	public static void main(String[] args) {

		Test t=new Test();
		//return type 이 void 인 메소드 호출
		t.walk();
		//return type ㅇ int 인 메소드 호출하고 리턴되는 값을 a 라는 int type 지역변수에다미
		int a=t.getNumber();
		//return type 이 string 인 메소드 호출하고 리턴되는 값을 b 라는 string type 지역 변수에담기
		String b=t.getGreeting();
	
		AirPlane c=t.getPlane();
		c.fly();
		
		//setNum 메소드를 호출해보세요
		t.setNum(10);
		//setName 메소드를 호출해보세요
		t.setName("이안철");
		//setPalne 메소드를 호출해보세요
		t.setPalne(new AirPlane());
	}
	

}
