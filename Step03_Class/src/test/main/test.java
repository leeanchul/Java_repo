package test.main;

import test.mypac.Info;

public class test {

	public static void main(String[] args) {
		Info info=new Info();
		info.name="이안철";
		info.age=25;	
		info.addr="미사";
		
		Info info2=new Info();
		info2.name="이다희";
		info2.age=22;
		info2.addr="강동";
		
		Info info3=new Info();
		info3.name="홍길동";
		info3.age=19;
		info3.addr="korea";
		
		info.mation();
		info2.mation();
		info3.mation();
	}

}
