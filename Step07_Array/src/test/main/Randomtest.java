package test.main;

import java.util.Random;
import java.util.Scanner;

public class Randomtest {

	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		
		int [] lotto=new int[7];
		int [] nums=new int[6];
		
		System.out.println("1~45 까지 수를 입력하세요!");
			for(int i=0; i<nums.length;i++) {
				
				System.out.print((i+1)+"번째 번호를 입력하세요:");
				nums[i]=sc.nextInt();
			}
			
		
		System.out.println("--로또 당첨을 시작합니다!--");
		
		
		//로또 랜덤 숫자 뽑기
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=ran.nextInt(1,45);
			if(i+1==7) {
				System.out.print("보너스번호:"+lotto[i]);
			}else {
			System.out.print((i+1)+"번째번호:"+lotto[i]+",");
			}
		}
		System.out.println(" ");
		System.out.println("--내로또 번호--");
		for(int i=0; i<nums.length;i++) {
			System.out.print((i+1)+"번째번호:"+nums[i]+",");
		}
		
		
	}
			
}


