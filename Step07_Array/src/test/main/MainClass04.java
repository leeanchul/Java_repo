package test.main;

import java.util.Random;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 * 	1.run 했을때
		 * 		cherry,apple,banana,melon,7
		 * 		5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.
		 */
	
		
		String [] data= new String[5];
		data[0]="cherry";
		data[1]="apple";
		data[2]="banana";
		data[3]="melon";
		data[4]=Integer.toString(7); 
		
		Random ran=new Random();
		int rd=ran.nextInt(5);
				
		System.out.println(data[rd]);
		
		
	}

}
