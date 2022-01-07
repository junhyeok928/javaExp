package javaexp.a08_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javaexp.a04_vo.Emp;

public class A05_DatabaseDao {
	// 1. 필드 선언
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	// 2. 공통 기능 메서드
	public void setConn() throws SQLException {
		// 드라이버
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 예외:" + e.getMessage());
		}
		// 서버접속
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott", "tiger");
		System.out.println("DB 접속 성공!!");
	}

	public void deptList() {
		try {
			setConn();
			String sql = "select * from dept02";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int row = 1;
			while (rs.next()) {
				System.out.print("행:" + row++ + "\t");
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString(2) + "\t"); // select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3) + "\n"); // select를 통해서 데이터 순서로 1부터
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:" + e.getMessage());
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void insertEmp(Emp ins) {
		String sql = "INSERT INTO emp02 values(" + ins.getEmpno() + ",'" + ins.getEname() + "','" + ins.getJob() + "',"
				+ ins.getMgr() + ",sysdate," + ins.getSal() + "," + ins.getComm() + "," + ins.getDeptno() + ")";
		try {
			setConn();
			// 자동커밋 방지
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			closeRsc();
		}
	}

	void closeRsc() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
