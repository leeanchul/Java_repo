package test.main;

import java.util.ArrayList;
import java.util.List;

import Member.Dto.MemberDto;

public class MainClass09 {
	
	static List<MemberDto> list=new ArrayList<>();
	private static int num;
	private static String name;
	private static String addr;

	
	
	//여러 회원의 목록을 리턴하는 매서드
	public static List<MemberDto> getList(){
		MemberDto dto=new MemberDto();
	
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		return list;
		
	}
	//run 했을때 실행의 흐름이 시작되는 main 메소드
	public static void main(String[] args) {
		
		//메소드를 이용해서 회원 목록 얻어내기
		
		List<MemberDto> list=getList();

		
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
	}
}
