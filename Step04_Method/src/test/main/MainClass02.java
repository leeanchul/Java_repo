package test.main;

import test.mypac.*;

public class MainClass02 {

	public static void main(String[] args) {
		Test t=new Test();
		t.doSomething(10, "lee", new AirPlane());
		
		//t.send ==> 오버로딩 되어 있다.
		t.send();
		t.send(10);
		t.send("이안철");
		t.send(new AirPlane());
	}

}
