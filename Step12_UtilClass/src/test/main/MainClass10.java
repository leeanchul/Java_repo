package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 세명의 회원정보(번호, 이름,주소) 를 HashMap 객체에 각각 넣어서
		 * 
		 * ArrayList 객체에 누적 시켜 보세요.
		 * 
		 * 반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해보세요.
		 * 
		 * (HashMap 객체 3개 , ArrayList 객체 1개 가 생성이 되어야 합니다)
		 * 
		 * ArrayList 객체 안에서 HashMap 을 담을 예정이니
		 * 
		 * List<HashMap<String,Object> type 이 필요합니다.
		 */
		Map<String, Object> map1=new HashMap<>();
		Map<String, Object> map2=new HashMap<>();
		Map<String, Object> map3=new HashMap<>();
		
		map1.put("num", 1);
		map1.put("name", "안촐랑");
		map1.put("addr", "미사");
		
		map2.put("num", 2);
		map2.put("name", "다짱");
		map2.put("addr", "길동");
		
		map3.put("num", 3);
		map3.put("name", "빼빼");
		map3.put("addr", "풍산");	
		
		List<Map<String,Object>> list=new ArrayList<>();
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		for(int i=0; i<list.size(); i++) {
			Map<String,Object> a=list.get(i);
			String result=String.format("번호:%d 이름:%s 주소:%s", a.get("num"),a.get("name"),a.get("addr"));
			System.out.println(result);
		}
		
		
		for(Map<String,Object> tmp:list) {
			String result=String.format("번호:%d 이름:%s 주소:%s", tmp.get("num"),tmp.get("name"),tmp.get("addr"));
			System.out.println(result);
		}

	}
}
