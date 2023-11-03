package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		//class 다, 이름이 없는 익명 클래스 extends Weapon 된 클래스 new Weapon()은 익명 클래스의 생성자를 call하는 표현식
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("슈웅!펑!펑!펑!@!@");
				
			}
		};
		
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("슈웅!펑!펑!");
				
			}
		});
		
	}
	
	//weapon type 의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
