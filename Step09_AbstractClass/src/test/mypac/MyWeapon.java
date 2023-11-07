package test.mypac;

public class MyWeapon extends Weapon{

	@Override
	public void attack() { //부모 클래스 Weapon클래스에 추상메소드 attack 강제적으로 정의해야된다.
		System.out.println("공격!!|---_____---__-");
		
	}

}
