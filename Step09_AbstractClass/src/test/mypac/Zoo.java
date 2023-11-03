package test.mypac;

public class Zoo {
	//필드,메소드,생성자+클래스(inner class)
	public class Monkey{
		public void say() {
			System.out.println("우끼끼~우끼끼~");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("어흥!! 어흥!!");
		}
	}
	
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
