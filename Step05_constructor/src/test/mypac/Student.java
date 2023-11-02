package test.mypac;

public class Student {
	
	//생성자(constructor)
	public Student() {
		//개체를 생성하는 시점에 무언가 준비 작업을 하고 싶으면 여기서 한다.
		System.out.println("Student() 생성자 호출됨");
	}
	public void study() {
		System.out.println("공부해요!");
	}
}
