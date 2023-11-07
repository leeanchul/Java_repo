package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * [추상클래스 (Abstract Class)]
 * 
 * -Class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 * -형태만 정의된 메소드를 만들때는 abstract 예약어를 
 * 붙어서 메소드를 정의한다
 * -생성자는 존재하지만 단독으로 객체 생성은 불가하다.
 * -추상클래스 type 의 참조값이 필요하다면 추상클래스를 상속받은
 * 	자식클래스를 정의해서 객체 생성한다.
 * -추상클래스를 상속받은 자식클래스는 부모의 추상메소드를
 *  모두 오버라이드(재정의) 해야한다.*/
public class MainClass01 {
	public static void main(String[] args) {
		//추상클래스 단독으로 객체 생성 불가능
		//Weapon w1=new Weapon(); 
		
		//Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체를 생성해서 Weapon type 의 참조값 얻어내기.
		Weapon w1=new MyWeapon();
		//메소드 호출
		w1.prepare();
		w1.attack();
	}
}
