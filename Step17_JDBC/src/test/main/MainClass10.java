package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import Member.Dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	
	//매개변수에 전달딘 회원번호에 해당되는 회원정보를 DB 에서 select 한 다음 MemberDto 객체에 담아서
	//리턴하는 메소드를 완성 시켜 보세요.
	//num 에 해당하는 만일 회원정보가 없으면 null 을 리턴하도록 하세요.
	public static MemberDto getData(int num) {
		//DB Connection 을 위해 객체를 미리 생성하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//dto 객체를 미리 생성
		MemberDto dto=null;
		try {
			//Connection 객체의 참조값 얻엉괴
			conn=new DBConnect().getConn();
			
			
			String sql="SELECT num,name,addr"
					+ " from member"
					+ " where num=?";
			//sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻오기
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			//SELECT 문 실행하고 결과 값을 ResultSet 으로 얻어내기
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto=new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return dto;
	}
	public static void main(String[] args) {
		
		int num=9;

		//1 번 회원의 정보를 얻어와서
		MemberDto dto=getData(num);
		//사용하기
		if(dto!=null) {
			System.out.println(num+"번 회원의 이름은 "+dto.getName()+"이고 주소는 "+dto.getAddr());
		}else {
				System.out.println(num+" 번 회원은 존재하지 않습니다.");
			}
		}
	
}
