package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Member.Dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	
	//여러 회원의 목록을 리턴하는 매서드
	public static List<MemberDto> getList(){
		List<MemberDto> list=new ArrayList<>();
		//DB에서 SELECT 하기위해서 필요한 객체를 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			
			//실행할 sql문 미리 준비
			String sql="SELECT num,name,addr"
					+ " from member"
					+ " ORDER BY num ASC"; //oracle 에서는||==+
			
			//sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻오기
			pstmt=conn.prepareStatement(sql);
			
			//sql 문이 미완성이라면 (?가 있다면)여기서 ? 에 값을 바인딩 해준다.
			//pstmt.setString(1,"촐");
			
			//SELECT 문 실행하고 결과 값을 ResultSet 으로 얻어내기
			rs=pstmt.executeQuery();
			
			//반복문 돌면서 
			while(rs.next()) { //cursor 다음 line 에 select 된 row 가 있다면
					//cursor 가 위치한 곳에서 num,name, addr 컬럼의 정보를 얻어낸다
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				//MemberDto 객체를 생성해서
				MemberDto dto=new MemberDto();
				//회원 한명의 정보를 담고
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				
				list.add(dto);
	
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
