package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Member.Dto.MemberDto;
import test.util.DBConnect;

public class MainClass08 {
	public static void update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=new DBConnect().getConn();
			
			String sql="UPDATE member"
					+ " set name=?,addr=?"
					+ "	where num=?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			pstmt.executeQuery();
			System.out.println("업데이트");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		int num=1;
		String name="수정";
		String addr="수정";
		
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		dto.setNum(num);
		update(dto);
	}
}
