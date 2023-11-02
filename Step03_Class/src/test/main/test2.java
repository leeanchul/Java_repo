package test.main;

import test.mypac.Infostatic;
public class test2 {

	public static void main(String[] args) {
		
		Infostatic.acorn();
		
		String a=Infostatic.name;
		Infostatic.age=25;
		String b=Infostatic.name="홍길동";
		
		System.out.println(a);
		System.out.println(b);
	}

}
