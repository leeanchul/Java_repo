package test.main;

import java.util.List;

import Member.Dto.MemberDto;
import test.dao.MemberDao;

public class MainClass11 {

	public static void main(String[] args) {
			MemberDao dao=new MemberDao();
			MemberDto dto=new MemberDto();
			String name="원숭이";
			String addr="동물원";
			dto.setName(name);
			dto.setAddr(addr);
			dao.insert(dto);
	}	
}
