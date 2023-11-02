package test.main;

import test.mypac.*;
public class MainClass03 {

	public static void main(String[] args) {
		/*
		 * MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아 보세요/
		 * 
		 * 주의!
		 * -MacBook 클래스를 절대 수정하지 마세요
		 * -MainClass03 은 test.main 패키지에 있고
		 * 	Cpu,Memory,HardDisk ,Macbook 클래스는 test.mypac 패키지에 있기 때문에 
		 * 	4개의 클래스 모두 import 되어야 한다.
		 * */
		
		//생성자의 매개변수에 전달할 값을 직접 생성해서 전달한다.	
		MacBook mac1=new MacBook(new Cpu(),new Memory(),new HardDisk());
		
		Cpu c1=new Cpu();
		Memory m1=new Memory();
		HardDisk h1=new HardDisk();
		//생성자의 매개변수에 전달할 값이 지역변수에 저장되어 있으면 지역변수 명으로 전달도 가능하다.
		MacBook mac2=new MacBook(c1,m1,h1);
	}

}
