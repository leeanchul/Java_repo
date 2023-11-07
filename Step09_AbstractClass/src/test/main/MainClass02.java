package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//userSTring 메소드 호출하기
		MainClass02.useString("abcd");
		useString("abcd1234");
		
		//아래의 useWeapon() 메소드를 여기서 호출해보세요
		useWeapon(new MyWeapon());
		
		
		System.out.println("main 메소드가 종료 됩니다.");
		
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	public static void useString(String msg) {
		System.out.println(msg+"의 길이:"+msg.length());
	}
}
