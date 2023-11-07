package test.main;

import test.mypac.*;
public class MaiClass01 {
	public static void main(String[] args) {
		//box 와 box2 에 . 을 찍어서 차이점을 확인해 보세요.
		FrultBox<Apple> box1=new FrultBox<Apple>();
		
		FrultBox<Orange> box2=new FrultBox<Orange>();
		
		//FrultBox<Melon> box3=new FrultBox<Melon>();
		
		//객체 생성시에 Generic type 은 생략 가능하다
		FrultBox<Melon> box3=new FrultBox<>();
		
		//Generic 클래스 Apple 로 되어있는 객체 사용하기
		box1.pack(new Apple());		//Apple type 을 매개변수에 전달하낟.
		Apple f1=box1.unpack();		//Apple type 이 리턴딘다.
	
		box2.pack(new Orange());
		Orange f2=box2.unpack();
		
		box3.pack(new Melon());
		Melon f3=box3.unpack();
		
	}
}
