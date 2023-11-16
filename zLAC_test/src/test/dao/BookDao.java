package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.Dto.BookDto;
import test.util.DBConnect;

public class BookDao {
	public List<BookDto> select() {
		//DB 에서 SELECT 하기위해서 필요한 객체를 담을 지역변수 미리 만들기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookDto> list=new ArrayList<>();
		try {
			//Connection 객체의 참조값 얻어오기 
			conn = new DBConnect().getConn();
			//실행할 sql문 미리 준비
			String sql = "select bname,author,publish,isbn"
					+ ",price,bnum from book";
			//sql 문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//만일 sql 문이 미완성이라면( ? 가 있다면) 여기서 ? 에 값을 바인딩 해준다.
			rs = pstmt.executeQuery();
			//반복문 돌면서 
			while (rs.next()) {// cursor 다음 line 에 select 된 row 가 있다면
				BookDto dto=new BookDto();
				dto.setBname(rs.getString("bname"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublish(rs.getString("publish"));
				dto.setIsbn(rs.getString("isbn"));
				dto.setPrice(rs.getInt("price"));
				dto.setBnum(rs.getInt("bnum"));
				list.add(dto);
				
			}
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
	
	public void soldBook(BookDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();

			String sql = "update book"
					+ " set bnum=?"
					+ " where isbn=?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,dto.getBnum());
			pstmt.setString(2, dto.getIsbn());
			
			
			pstmt.executeUpdate();
			
			System.out.println("판매완료");

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
	}
	public void addBook(BookDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();

			String sql = "insert into book"
					+ " (bname,author,publish,isbn,price,bnum)"
					+ " values(?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3,dto.getPublish());
			pstmt.setString(4, dto.getIsbn());
			pstmt.setInt(5, dto.getPrice());
			pstmt.setInt(6, dto.getBnum());
			
			pstmt.executeUpdate();
			System.out.println("추가되었습니다.");
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
	}
	

	
	public void update(BookDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();

			String sql = "update book"
					+ " set bname=?,author=?,publish=?,"
					+ "price=?,bnum=?"
					+ " where isbn=?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getPublish());
			pstmt.setInt(4, dto.getPrice());
			pstmt.setInt(5, dto.getBnum());
			pstmt.setString(6, dto.getIsbn());
			
			
			pstmt.executeUpdate();
			
			System.out.println("수정");

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
		
	}
	
	public void delete(String isbn) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new DBConnect().getConn();

			String sql = "delete from book"
					+ " where isbn=?";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, isbn);
			pstmt.executeUpdate();

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
	}
	
	
}
