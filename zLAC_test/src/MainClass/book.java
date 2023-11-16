	package MainClass;
	

import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	import mypac.AcDto;
	
	public class book {
		public static void main(String[] args) {
			
		Scanner ac=new Scanner(System.in);
		List<AcDto> list=new ArrayList<>();
	
		AcDto bdto1=new AcDto(ac.nextLine(),ac.nextLine(),ac.nextInt());

		
		bdto1.print();
		}
	}
