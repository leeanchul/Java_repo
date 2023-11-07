package MainClass;

import mypac.*;


public class MainClass01 {
	public static void main(String[] args) {
		Animal a1=new Tiger();
//		a1.ac();
//		a1.move();
//		a1.cry();
		
		Animal a2=new Dog();
//		a2.ac();
//		a2.move();
//		a2.cry();
		
		
		All a3=new All("호랑이");
		a3.cry();
		All a4=new All("강아지");
		a4.cry();
		
		
		
	}
}
