package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain1 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 반복문 돌면서 3며의 이름을 입력 받아서
		 *  
		 *  ArrayList 객체에 순서대로 저장하고
		 *  
		 *  다 저장된 이후에 
		 *  
		 *  반복문을 돌면서 ArrayList 에 저장된 3명의 이름을 순서대로 콘솔창에 출력하기!*/
		
		Scanner ac=new Scanner(System.in);
		
		List<String> names=new ArrayList<>();
		
	
		for (int i=0; i<3; i++) {
			System.out.print("이름입력:");
			names.add(ac.nextLine());
		}
		
		for (int i=0; i<3; i++) {
			System.out.println(names.get(i));
		}
	}
}
