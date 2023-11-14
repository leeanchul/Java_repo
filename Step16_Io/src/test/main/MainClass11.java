package test.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		//MemberDto.dat 파일에 저장된 MemberDto 객체를 읽어와서 회원의 번호이름,주소를 콘솔에출력 해보세요.

		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:/acorn202310/myFolder/members.dat");
			ois=new ObjectInputStream(fis);
			//읽어낸 Object 를 원래 type 인 MemberDto type 으로 casting 한다.
			MemberDto dto=(MemberDto)ois.readObject();
			String info=String.format("%d,%s %s",dto.getNum(),dto.getName(),dto.getAddr() );
			System.out.println(info);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(ois!=null)ois.close();
			}catch (Exception e) {
			}
		}
	}
	
}
