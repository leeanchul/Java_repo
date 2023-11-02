package test.main;

import test.mypac.Imc;
import test.mypac.Student;
public class Test {

	public static void main(String[] args) {
		
		
		Imc st1=new Imc("안촐랑",25,"misa",175.2,776);
		st1.profile();
		
		Imc st2=new Imc("홍길동",22,"korea",180.3,80.2);
		st2.profile();
		
		Imc st3=new Imc("김구라",20,"노량진",177.7,77.7);
		st3.profile();
		
		st1.send();
		st1.send(10);
		st2.send(10.2);
		st3.send(new Student());
	}

}
