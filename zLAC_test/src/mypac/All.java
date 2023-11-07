package mypac;

public class All <T>{
	private T a;
	
	public All(T a) {
		this.a=a;
	}
	
	public T cry() {
		System.out.println(a+"가 울어요");
		return ac();
	}
	public T ac() {
		System.out.println(a+"가 물어요");
		return a;
	
	}
}
