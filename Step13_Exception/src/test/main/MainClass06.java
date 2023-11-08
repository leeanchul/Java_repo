package test.main;

import java.util.Scanner;

import test.mypac.MyUtil;

public class MainClass06 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
			

			while(true) {
			System.out.println("전송할 문자열 입력:");
			String inputMsg=ac.nextLine();
			//MyUtill 클래스의 static 메소드를 이용해서 전송하기
			try {
				MyUtil.sendMessage(inputMsg);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}

		

	}

}
