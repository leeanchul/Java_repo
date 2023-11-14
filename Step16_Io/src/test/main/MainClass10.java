package test.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		//MemberDto 객체를 실제 파일에 출력하기
		MemberDto dto=new MemberDto(1,"안촐랑","미사");
		
		//필요한 객체의 참조값을 담을 지역 변수를 미리 만들기
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("c:/acorn202310/myFolder/members.dat");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(dto);
			System.out.println("MemberDto 객체를 members.dat 파일에 저장했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
