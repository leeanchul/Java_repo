package test.mypac;

public class Imc {
	public int age;
	public String name;
	public String addr;
	public double cm;
	public double kg;
	
	public Imc(String name,int age,String addr,double cm,double kg){
		System.out.println("--"+name+"님 의 정보--");
		this.name=name;
		this.age=age;
		this.addr=addr;
		this.cm=cm;
		this.kg=kg;
	}
	
	public void profile() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+addr);
		System.out.println("키:"+cm+"cm"+",몸무게:"+kg+"kg"+"\n");

	}
	public void send() {
		System.out.println("매겨변수가 없어요!");
	}
	public void send(int a) {
		System.out.println(a+"매겨변수 int!");
	}
	public void send(String b) {
		System.out.println(b+"매겨변수가 String!");
	}
	public void send(double c) {
		System.out.println(c+"매겨변수가 double!");
	}
	public void send(Student d) {
		d.study();
		System.out.println("해시코드:"+d);
	}
}
