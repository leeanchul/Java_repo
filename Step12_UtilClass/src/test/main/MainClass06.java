package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		useNums();
		useNums(10,20);
		useNums(10,20,30);
		
		useStrings();
		useStrings("안","촐","랑");
		
		useCars();
		useCars(new Car("포르쉐"));
		useCars(new Car("람보르기니"),new Car("페라리"));
	}
	//Integer type 여러개를 전달받는 메소드
	public static void useNums(Integer...nums) {//nums 는 Integer [] 이다.
		
	}
	//String type 여러개를 전달받는 메소드
	public static void useStrings(String...strs) { //strs String[] 이다
		
	}
	//Car type 여러개를 전달받는 메소드
	public static void useCars(Car...cars) { //cars 는 Carp[] type 이다.
		
	}
}
