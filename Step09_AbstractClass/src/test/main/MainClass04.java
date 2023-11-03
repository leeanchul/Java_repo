package test.main;

public class MainClass04 {
	//static 메소드 안에서 사용하려면 static 예약어가 필요!
		public static class Gura{
			public void say() {
				System.out.println("안녕!!");
			}
		}
		
		public static void main(String[] args) {
			Gura g1=new Gura();
			g1.say();
			
			class Cat{
				public void say() {
					System.out.println("냥! 야옹~!");
				}
			}
			Cat c1=new Cat();
			c1.say();
	}
		
}
