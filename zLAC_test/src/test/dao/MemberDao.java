package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {

	public void insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
		conn=new DBConnect().getConn();
		String sql="insert into member"
				+ " (num,name,addr)"
				+ "	values(?,?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, dto.getNum());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3,dto.getAddr());
		
		pstmt.executeUpdate();
		
		System.out.println("성공");
		
		}catch (Exception e) {
		}
	}
	public void delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
		conn=new DBConnect().getConn();
		String sql="delete from member"
				+ "	where num=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		
		pstmt.executeUpdate();
		
		System.out.println("성공");
		
		}catch (Exception e) {
		}
	}
	
	
	public List<MemberDto> getlst(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<MemberDto> list=new ArrayList<>();
		try {
		conn=new DBConnect().getConn();
		String sql="select num,name,addr"
				+ " from member";
		pstmt=conn.prepareStatement(sql);
		
		rs=pstmt.executeQuery();
		while(rs.next()) {
			MemberDto dto=new MemberDto();
			dto.setNum(rs.getInt("num"));
			dto.setName(rs.getString("name"));
			dto.setAddr(rs.getString("addr"));
			list.add(dto);
		}
		
		System.out.println("성공");
		
		}catch (Exception e) {
		}	
		return list;
	}
}
