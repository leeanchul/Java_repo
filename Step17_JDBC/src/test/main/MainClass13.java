package test.main;

import java.util.List;

import Member.Dto.MemberDto;
import test.dao.MemberDao;

public class MainClass13 {
	public static void main(String[] args) {
		List<MemberDto> list=new MemberDao().getList();
		list.forEach((item)->{
			String info=String.format("번호: %d 이름:%s 주소:%s", item.getNum(),item.getName(),item.getAddr());
			System.out.println(info);
		});
		
	}
}
