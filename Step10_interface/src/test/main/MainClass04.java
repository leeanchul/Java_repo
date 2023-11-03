package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("두두두뚜...두두두...두두");
			}
		});
		
		//추상 메소드가 하나인 경우에만 사용가능하다 ()->{} 
		useDrill(()->{System.out.println("두...두..기능 고장");});
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
