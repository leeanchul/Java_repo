package test.main;

import test.dao.MemberDao;

public class MainClass14 {
	public static void main(String[] args) {
		//10 번 회원을 삭제 하려면?
		int num=9;
				
		//MemberDao 객체를 이용해서 삭제하기
		boolean isSuccess=new MemberDao().delete(num);
		
			if(isSuccess) {
			System.out.println(num+"을 삭제했습니다.");
			}else {
				System.out.println("실패");
			}
	}
}
