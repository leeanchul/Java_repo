package test.main;

import Member.Dto.MemberDto;
import test.dao.MemberDao;

public class MainClass12 {
	public static void main(String[] args) {
		int num=2;
		
		MemberDao dao=new MemberDao();
		MemberDto dto=dao.getDate(num);
		
		System.out.println("번호:"+num+" 이름:"+dto.getName()+" 주소:"+dto.getAddr());
	}
}
