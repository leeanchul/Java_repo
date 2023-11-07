	package MainClass;
	

import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	import mypac.BookDto;
	
	public class book {
		public static void main(String[] args) {
			
		Scanner ac=new Scanner(System.in);
		List<BookDto> list=new ArrayList<>();
	
		BookDto bdto1=new BookDto(ac.nextLine(),ac.nextLine(),ac.nextInt());

		
		bdto1.print();
		}
	}
