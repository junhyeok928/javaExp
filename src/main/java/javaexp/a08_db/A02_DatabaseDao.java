package javaexp.a08_db;

import java.sql.*;

public class A02_DatabaseDao {
	// ex) 연결 처리 객체 만들기
	// 1. 공통 필드 선언
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	// 2. 공통 메서드 선언
	public void setConn() throws SQLException {
		// 1) 드라이버 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("에러: " + e.getMessage());
		}
		// 2) 특정서버 연결
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(info, "scott", "tiger");
		} catch (SQLException e) {
			System.out.println("에러: " + e.getMessage());
		}
		System.out.println("접속 성공");
	}

	// 조회 처리 메서드 구현1단계 (출력)
	public void empList() {
		// 1. 연결공통 메서드 호출
		try {
			setConn();
			// 2. Statement 객체 생성 ( Connection ==> Statement)
			stmt = con.createStatement();
			String sql = "SELECT * FROM EMP";
			// 3, ResultSet 객체 생성. sql의 결과(Statement ==> ResultSet)
			rs = stmt.executeQuery(sql);
			// 4. while()을 통해 결과 내용 처리 sql의 결과는 처리
			// rs.next() 행단위로 이동하게 처리
			int rowNum = 1;
			while (rs.next()) {
				System.out.println(rowNum++ + "행");
			}
			// 5. 자원 해제
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// 6. 예외 처리..
			System.out.println(e.getMessage());
			if(rs!=null) rs = null;	// 강제로 자원해제..
			if(stmt!=null) stmt = null;
		}
	}
	// ex) A03_DatabaseDao.java 를 만들고
	//		필드, 공통메서드, public void deptList()로 선언하여
	//		sql을 select * from dept로 처리된 행를 출력하는 내용까지 처리하세요.
	public static void main(String[] args) {
		// 객체 생성 및 메서드 처리
		A02_DatabaseDao dao = new A02_DatabaseDao();
		dao.empList();
	}

}
