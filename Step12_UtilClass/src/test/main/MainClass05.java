package test.main;
import java.util.ArrayList;
import java.util.List;

import test.mypac.*;
public class MainClass05 {

	public static void main(String[] args) {
		//1. Member 객체를 담을수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아 보세요.
		List<Member> members=new ArrayList<>();
		//2. 3명의 회원정보를 Member 객체에 담아 보세요.(Member 객체가 3개 생성되어야 함)
		Member m1=new Member(1,"안촐랑","misa");
		Member m2=new Member(2,"다짱","강동");
		Member m3=new Member(3,"빼빼","신사");
		//3.위에서 생성한 Member 객체의 참조값을 ArratList 객체에 모두 담아 보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		/*
		 * 4.Member List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 * 반복문 돌면서 출력해 보세요
		 * 
		 * 번호" 1, 이름:김구라 ,주소:노량진
		 * 
		 * 
		 * */
		for(int i=0; i<members.size();i++) {
			int num=members.get(i).num;
			String name=members.get(i).name;
			String addr=members.get(i).addr;
			
			System.out.println("번호"+num+",이름:"+name+",주소:"+addr);
		}
		System.out.println("======================");
		for(Member tmp:members) {
		String result="번호"+tmp.num+",이름:"+tmp.name+",주소:"+tmp.addr;
			System.out.println(result);
		
		}
		/*
		 * 숫자 :%d;
		 * 문자 :%s
		 * String.format ("format 문자열:", 전달할값1,2...) */
		System.out.println("======================");
		members.forEach((tmp)->{
			String result=String.format("번호:%d,이름:%s, 주소:%s", tmp.num,tmp.name,tmp.addr);
			System.out.println(result);
		});
	}
}
