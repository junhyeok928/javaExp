package javaexp.a08_db;

import java.sql.*;

public class A03_DatabaseDao {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void setConn() throws SQLException{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("에러발생: "+ e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(info,"scott","tiger");
		} catch (SQLException e) {
			System.out.println("에러발생: "+e.getMessage());
		}
		System.out.println("접속성공");
		
	}
	public void deptList() {
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * FROM DEPT";
			rs = stmt.executeQuery(sql);
			int rowNum = 1;
			while (rs.next()) {
				System.out.println(rowNum+++"행");
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			if(rs!=null) rs = null;
			if(stmt!=null) stmt = null;
		}
	}
	public static void main(String[] args) {
		A03_DatabaseDao dao = new A03_DatabaseDao();
		dao.deptList();
	}

}
