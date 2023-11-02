package test.mypac;

public class Test2 {
	public int age;
	public String name;
	public String addr;
	
	public Test2(int age,String name,String addr) {
		this.age=age;
		this.name=name;
		this.addr=addr;
	}
	
	public void print() {
		System.out.println("나이:"+age+",이름:"+name+",주소:"+addr);
	}
}
