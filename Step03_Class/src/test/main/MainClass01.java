package test.main;
//다른 패키지의 클래스를 사용할때는 import 를 해야한다.
import test.mypac.Car;

public class MainClass01 {

	public static void main(String[] args) {
		//test.mypac.Car 클래스로 객체를 생성하고 생성 된 객체의 car 이라는 지역변수에 담기 
		Car car1=new Car();
		//메소드 호출
		car1.drive();
		//필드에 저장된값 참조(불러오기)
		String a=car1.name;
		//필드에 값 대입하기
		car1.name="아반떼";
		///대입한 이후에 필드에 저장된값 참조(불러오기)
		String b=car1.name;
	}
	/* javascript 코드로는...
	 * 
	 * let cal1={name:null,drive:function(){consol.log("달려요"}}
	 * 
	 * car1.drive();
	 * 
	 * let a=car1.name;
	 * 
	 * car1.name-"소나타";
	 * 
	 * let b=car1.anme;
	 * */

}
