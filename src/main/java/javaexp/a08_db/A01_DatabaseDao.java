package javaexp.a08_db;

import java.sql.*;

public class A01_DatabaseDao {
	/*
	# Database 처리//
	1. 처리순서
		1) jdbc드라이버를 멤리에 로딩
	
	2. Dao 클래스 선언
	 	1)
		2) 연결처리 기능 메서드 구현
			- jdbc메모리 로딩
			- ip/port/계정/비밀번호통해서 연결.
			
		3) 조회기능 메서드 처리
			- 공통 연결 메서드 호출.
			- 대화 객체 호출
			- 결과객체 호출
			- VO객체 담기
	3. 웹프로그램에서 DB서버 처리 방법
		1) 프로그램 처리 구성도
			브라우저	웹server					DBserver
			요청처리	요청페이지호출된
						DB수행이 필요한 페이지		DB데이터
						DAO
						
	# DAO 처리 순서
	1. 공통 필드 선언,
		공통적으로 사용될 객체 선선...
		연결, 대화, 결과
	2. 공통으로 사용할 연결 처리 기능 메서드 선언..
	 */
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	// 연결 공통 메서드
	public void setConn() {
		// 1. 공통 소스 드라이버 패키지
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		
		// 2. 특정 서버에 연결
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			// 메모리에 OracleDriver가 로딩된 상황에서
			// DriverManager.getConnection("접속정보","계정","비밀번호");
			con = DriverManager.getConnection(info,"scott","tiger");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러: "+e.getMessage());
		}
		System.out.println("접속 성공");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_DatabaseDao dao = new A01_DatabaseDao();
		dao.setConn();
	}

}
