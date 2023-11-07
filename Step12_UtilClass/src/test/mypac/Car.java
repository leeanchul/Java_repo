package test.mypac;

public class Car {
	private String name;
	
	public Car(String name) {
		this.name=name;
	}
	
	public void drive() {
		System.out.println(name+"가 달려요!");
	}
}
