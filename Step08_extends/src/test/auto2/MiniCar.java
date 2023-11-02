package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class MiniCar extends Car {

	public MiniCar(Engine engine) {
		super(engine);
	}
	
	public void openTrunck() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 동작을 안해요");
			return; //메소드를 여기서 리턴시키키 (종료시키기)
		}
		System.out.println("트렁크를 열어용~!");
	}
}
