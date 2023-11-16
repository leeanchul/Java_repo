package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Member.Dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	//회원 한명의 정보를 DB 에 저장하는 메소드
	public boolean insert(MemberDto dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount=0;
		try {
			conn = new DBConnect().getConn();

			String sql = "insert into member"
					+ "	(num,name,addr)"
					+ " values(member_seq.nextval,?,?)";

			pstmt = conn.prepareStatement(sql);
			
		
			pstmt.setString(1, dto.getName() );
			pstmt.setString(2, dto.getAddr());
			
			rowCount=pstmt.executeUpdate();
			System.out.println("insert문 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원 한명의 정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount=0;
		try {
			conn = new DBConnect().getConn();

			String sql = "update member"
					+ " set name=?,addr=?"
					+ " where num=?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			rowCount=pstmt.executeUpdate();
			System.out.println("업데이트 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(rowCount>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount=0;
		try {
			conn = new DBConnect().getConn();

			String sql = "delete from member"
					+ "	where num=?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			int a=pstmt.executeUpdate();

			
			//System.out.println(num+"번 정보가 삭제되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)pstmt.close();
				if (conn != null)conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(rowCount>0) {
			return true;
		}else {
		return false;
		}
	}
	//매개변수에 전달딘 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드
	public MemberDto getDate(int num) {
		//DB 에서 SELECT 하기위해서 필요한 객체를 담을 지역변수 미리 만들기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto dto=new MemberDto();;
		try {
			//Connection 객체의 참조값 얻어오기 
			conn = new DBConnect().getConn();
			//실행할 sql문 미리 준비
			String sql = "select num,name,addr as my_addres"
					+ " from member"
					+ " where num=?";
			//sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//만일 sql 문이 미완성이라면( ? 가 있다면) 여기서 ? 에 값을 바인딩 해준다.
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			//반복문 돌면서 
			while (rs.next()) {// cursor 다음 line 에 select 된 row 가 있다면
				
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("my_addres"));
				
			}
			//System.out.println("번호:"+num+" 이름:"+dto.getName()+" 주소:"+dto.getAddr());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
	//회원 전체의 목록을 번호에 대해서 내림차순 정렬해서 리턴하는 메소드
	public List<MemberDto> getList(){
		//DB 에서 SELECT 하기위해서 필요한 객체를 담을 지역변수 미리 만들기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> list=new ArrayList<>();
		try {
			//Connection 객체의 참조값 얻어오기 
			conn = new DBConnect().getConn();
			//실행할 sql문 미리 준비
			String sql = " select num,name,addr"
					+ " from member";
			//sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//만일 sql 문이 미완성이라면( ? 가 있다면) 여기서 ? 에 값을 바인딩 해준다.
			rs = pstmt.executeQuery();

			//반복문 돌면서 
			while (rs.next()) {// cursor 다음 line 에 select 된 row 가 있다면
				MemberDto dto=new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				list.add(dto);
			}
			//for(MemberDto tmp:list) {
			//	System.out.println("번호:"+tmp.getNum()+"이름:"+tmp.getName()+"주소:"+tmp.getAddr());
			//}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
}
