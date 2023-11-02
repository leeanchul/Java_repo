package test.main;

import java.util.Scanner;

import test.mypac.*;
public class test2 {

	public static void main(String[] args) {
		
		Scanner ac=new Scanner(System.in);
		int [] ages=new int[5];
		String [] names=new String[5];
		String [] addrs=new String[5];
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 나이를 입력하세요:");
			ages[i]=ac.nextInt();
			System.out.print((i+1)+"번째 이름을 입력하세요:");
			names[i]=ac.next();
			System.out.print((i+1)+"번째 주소를 입력하세요:");
			addrs[i]=ac.next();
		}
		
		/*
		System.out.print("나이를 입력하세요:");
		int age=ac.nextInt();
		System.out.print("이름을 입력하세요:");
		String name=ac.next();
		System.out.print("주소를 입력하세요:");
		String addr=ac.next();
		*/
		//Test2 n=new Test2(age,name,addr);
		//n.print();
		
		for(int i=0; i<5; i++) {
			Test2 ni=new Test2(ages[i],names[i],addrs[i]);
			System.out.println("--"+(i+1)+"번째 정보--");
			ni.print();
		}
	}

}
