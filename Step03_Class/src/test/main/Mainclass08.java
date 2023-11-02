package test.main;

import test.mypac.Square;

public class Mainclass08 {
	public static void main(String[] args) {
		
		//Sqare 클래스로 객체를 생성하고 sq1 이라는 지역 변수에 담기
		Square sq1=new Square();
		//1번 사각형의 정보를 담기.
		sq1.width=30;
		sq1.height=40;
		
		sq1.result();
		
		Square sq2=new Square();
		
		sq2.width=20;
		sq2.height=100;
		
		sq2.result();
	}
}
