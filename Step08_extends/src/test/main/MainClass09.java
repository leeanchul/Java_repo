package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportsCar;

public class MainClass09 {

	public static void main(String[] args) {
		//SportsCar 객체를 생성해서 참조값을 car1 이라는 지역변수에 담아 보세요.
		SportsCar car1=new SportsCar(new Engine());
		//위에서 생성한 객체의 .drive() .opendrive() 메소드를 각각 호출해 보세요.
		car1.drive();
		car1.opendrive();
		
		SportsCar car2=new SportsCar(null);
		//위에서 생성한 객체의 .drive() .opendrive() 메소드를 각각 호출해 보세요.
		car2.drive();
		car2.opendrive();
		
		//Car car3=new SportsCar(new Engine());
		//((SportsCar)car3).opendrive();
		
		
	}

}
