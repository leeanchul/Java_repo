package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정 , 번호는 시퀀스로 넣기
		String name="호우";
		String addr="한국";
		
		
		Connection conn=null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피 주소:port번호:db이름
			String url="jdbc:oracle:thin:@192.168.0.66:1521:xe";
			//계정 비밀번호를 이ㅛㅇㅇ해서 Connection 객체의 참조값 얻어내기
			conn=DriverManager.getConnection(url,"scott","tiger");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성고잉다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
	PreparedStatement pstmt=null;

	try {
	
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
	}
}
