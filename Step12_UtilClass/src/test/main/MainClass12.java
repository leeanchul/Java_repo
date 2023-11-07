package test.main;

import java.util.HashSet;
import java.util.Set;

/*
 * HeshSet 은 Set 인터페이스를 구현한 클ㄹ래스 이다.
 * 
 * -순서가 없다.
 * -key 값도 없다.
 * -중복을 허용하지 않는다.
 * -어던 data 를 묶음(집합) 으로 관리하고자 할때 사용한다.
 */
public class MainClass12 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 HashSet 객체를 생성해서 참조값을 Set 인터페이스 type 지역변수에 담기
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);
		set.add(30);
		
		//문자열을 저장할수 있는 HashSet rorcp
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("Lee");
		set2.add("park");
		set2.add("lee");
		set2.add("Park");
		
		set.forEach(item->{
			System.out.println(item);
		});
		System.out.println("---------");
		set2.forEach(item->{
			System.out.println(item);
		});
		
		//특정 item(데이터,참조값) 존재 여부 알아내기
		boolean isContain=set2.contains("lee");
		//저장된 item 의 갯수
		int size=set2.size();
		//특정 item 삭제
		set2.remove("Park");
		//모든 item 삭제
		set2.clear();
	}
}
