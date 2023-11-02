package test.main;

import test.mypac.Car;

public class MainClass03 {

	public static void main(String[] args) {
		//Car 객체를 생성해서 사용하지 않고 버림
		new Car();
		
		//Car 객체를 생성해서 1번 사용하고 버릴(객체를 1회용으로 사용)
		new Car().drive();
		System.out.println("객체가 버려짐");
		
		//Car 객체를 생성해서 나온 참조값을 c1 이라는 Car type 지역변수에 담아 놓고
		Car c1=new Car();
		//필요할때 마다 c1 에 . 찍어서 여러번 사용할수 있다.
		c1.drive();
		c1.drive();
	}

}
