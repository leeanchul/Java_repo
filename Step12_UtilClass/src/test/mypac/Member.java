package test.mypac;

public class Member {
	//외부에서 접근이 가능한 공개(public)필드
	public int num;
	public String name;
	public String addr;
	
	public Member() {
		
	}
	public Member(int num,String name,String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}
