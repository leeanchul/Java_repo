package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "차");
		dic.put("pencil", "연필");
		dic.put("earser", "지우개");
		
		dic.get(dic);
		/*
		 * [콘솔창 실행 결과]
		 * 
		 * 검색할 단어를 입력하세요:house
		 * 
		 * house 의 뜻은 집입니다.
		 * 
		 * [콘솔창 실행 결과1]
		 * 
		 * 검색할 단어를 입력하세요:gura
		 * 
		 * gura는 목록에 없습니다.
		 * */
		
		

		System.out.print("검색할 단어를 입력하세요");
		String input=ac.next();
		
		if(dic.containsKey(input)) {
			String result=String.format("%s 의 뜻은 %s 입니다.", input,dic.get(input));
			System.out.println(result);
		}else {
			String result=String.format("%s 는 목록에 없습니다.", input);
			System.out.println(result);
			
			}
	
		
	}



}
