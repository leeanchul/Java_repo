package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정 , 번호는 시퀀스로 넣기
		String name="호우";
		String addr="한국";
		
		
			
			//필요한 객체에 참조값을 담을 지역 변수 미리 선언
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {
			conn=new DBConnect().getConn();
			//실행할 미완성 sql 문
			String sql="INSERT INTO member"
					+ " (num,name,addr)"
					+ " VALUES(member_seq.nextval,?,?)";
			
				//PireparedStatement 객체의 참조값 얻어오기
				pstmt=conn.prepareStatement(sql);
				//PreparedStatemennt 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(?에 값 바인딩하기)
				pstmt.setString(1, name);
				pstmt.setString(2, addr);
				//sql 문 실행하기
				pstmt.executeQuery();
				System.out.println("회원 정보를 추가했습니다.");
				
			}catch(Exception e) {
			e.printStackTrace();
			}	
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
				}	
		}
	}
}
