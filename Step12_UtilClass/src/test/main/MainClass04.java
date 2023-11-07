package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.*;
public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type 을 저장할수 있는 ArrayList 객체를 생성해서
		//참조값을 List 인터페이스 type 지역변수 cars 에 담아 보세요.
		
		List<Car> cars=new ArrayList<>();
		
		//2.Car 객체(3)를 생성해서 List 객체에 저장해 보세요/
		cars.add(new Car("포르쉐"));
		cars.add(new Car("람보르기니"));
		cars.add(new Car("페라리"));
		
		//3. 일반 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요
		System.out.println("--일반 for문을 이용해서 출력--");
		for (int i=0; i<cars.size(); i++) {
			cars.get(i).drive();
		}
		
		//4/ 확장 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해보세요
		System.out.println("--확장 for문을 이용해서 출력--");
		for(Car i: cars) {
			i.drive();
		}
		
		//5. Consumer 인터페이스를 활용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요.
		System.out.println("--Consumer 인터페이스 이용해서 출력--");
		Consumer<Car> con=new Consumer<>() {

			@Override
			public void accept(Car t) {
				t.drive();
			}
		};
		
		cars.forEach(con);
		
	
	}
}
