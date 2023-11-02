package test.mypac;

import test.mypac.AirPlane;
/*
 *  [메소드를 만들때 고려 해야 하는것]
 *  
 *  1.접근 지정자(모르면 public)
 *  2.static or non static (모르면 non static)
 *  3.리턴 type (모르면 void)
 *  4. 메소드명
 *  5. 메소드에 전달하는 연자의 갯수와 데이터 type
 */
public class Test {
	/*
	 * public => 패키지가 달라도 호출가능
	 * void=> 이 메소드는 어떤 값도 리턴하지 않느다
	 * walk => 메소드명은 walk
	 * ()=> 이 메소드는 어떤값도 인자로 전달받지 않는 메소드 이다.*매겨 변수가 선언디지 않고 비어 있음)
	 */
	public void walk() {
		System.out.println("걸어요");
	}
	/*
	 * int => 이 메소드를 호출한 그 위치로 int type 값을되돌려 주는 메소드
	 *
	 */
	public int getNumber() {
		int num=10;
		return num;
	}
	/*
	 *  String =>이 메소드를 호출한 그 위치로 string type 참조값을 되돌려 주는 메소드*
	 */
	public String getGreeting() {
		String greet="안녕하세요";
		return greet;
	}
	//test.mupsv Airplane 객체를 리턴해주는 메소드
	public AirPlane getPlane() {
		AirPlane p1=new AirPlane();
		return p1;
	}
	
	//int type 을 메소드의 인자로 절달 받는 메소드
	public void setNum(int num) {
	
	}
	//String type 을 메소드의 인자로 절달 받는 메소드	
	public void setName(String name) {
	
	}
	//AirPlane type 을 메소드의 인자로 절달 받는 메소드
	public void setPalne(AirPlane plane) { //매개변수에는 new AirPalne() 
		
	}
	public void doSomething(int num,String name,AirPlane plane) {
		
	}
	
	public void send() {
		System.out.println("무언가를 전송해요");	
	}
	public void send(int num) {
		System.out.println(num+"을 전송해요");	
	}
	public void send(String name) {
		System.out.println(name+"을 전송해요");	
	}
	public void send(AirPlane plane) {
		System.out.println(plane+"비행기를 전송해요");	
		plane.fly();
	}

}
