package test.mypac;
/*
 * Member 객체 하나에 회원의 번호,이름,주소 를 담기 위해 Member 클래스를 설계 하려고 한다.
 */
public class Member {
	public int num;
	public String name;
	public String addr;
	
	public void showInfo() {
		//this는 나의 (바로 이 객체) 참조값을 가리킨다. this. 은 생략 가능하다.
		String info="번호는"+num+"이고 이름은"+name+"이고 주소는"+addr+"입니다!";
		System.out.println(info);
		
		
	}
}
