package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass16 {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("안촐랑");
		names.add("텐철이");
		names.add("망부메타");
		names.add("리안촐");
		names.add("이상호");
		
		//반복자 객체 얻어내기
		Iterator<String> it=names.iterator();


		while(it.hasNext()) {
			String item=it.next();
			System.out.println(item);
		}
	}

}
