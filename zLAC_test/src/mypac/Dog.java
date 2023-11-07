package mypac;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("뽀삐! 뽀삐! 뽀삐뽀");
		
	}

	@Override
	public void cry() {
		System.out.println("왈! 왈!");
		
	}

	@Override
	public void ac() {
		System.out.println("크르르릉 왈!!");
		
	}

}
