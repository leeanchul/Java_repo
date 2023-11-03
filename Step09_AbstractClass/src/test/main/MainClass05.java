package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	static class SeaWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("바다를 공격하라!!!!!");
		}
		
	}
	
	public static void main(String[] args) {
		Weapon w1=new SeaWeapon();
		w1.prepare();
		w1.attack();
		
		class SpaceWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("하늘을 공격하라!!");
			}
		}
		
		Weapon w2=new SpaceWeapon();
		w2.prepare();
		w2.attack();
	}
}
