package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() { //추상메소드 강제 오버라이드 해야되기때문에 오류가 발생한다.
			@Override
			public void up() {
				System.out.println("볼륭을 올려요");
			}
			@Override
			public void down() {
				System.out.println("볼륨을 내려요");
			}
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("채널이 막 올라가요");
				
			}

			@Override
			public void down() {
				System.out.println("채널이 막 내려가요");
				
			}
			
		});
		
		use(new MyRemocon());
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
	public static void use(MyRemocon mr) {
		mr.up();
		mr.down();
	}
}
