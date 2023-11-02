package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//defalut생성자
	public Member() {
		
	}
	//int,String,String type 을 전달 받는 생성자 (생성자 오버로딩)
	public Member(int _num,String name,String addr){ //매개변수는 지역변수. 프로그램 실행시 사라진다.
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	//메소드
	public void printInfo() {
		System.out.println("번호:"+num+"이름:"+name+"주소:"+addr);
	}
}
