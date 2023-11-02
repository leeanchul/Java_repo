package test.main;

import test.mypac.Member;


public class MainClass07 {

	public static void main(String[] args) {
		//Member 클래스로 객체를 생성하고 참조값을 mem1 이라는 지역 변수에 담기
		Member mem1=new Member();
		//1번 회원의 정보를 담아보세요
		mem1.num=1;
		mem1.name="이안철";
		mem1.addr="미사";
		
		//Member 클래스로 객체를 생성하고 참조값을 mem2 이라는 지역 변수에 담기
		Member mem2=new Member();
		//2번 회원의 정보를 담아보세요
		mem2.num=2;
		mem2.name="이다희";
		mem2.addr="강동";
		
		mem1.showInfo();
		mem2.showInfo();
		
		
	

	}
	
}

