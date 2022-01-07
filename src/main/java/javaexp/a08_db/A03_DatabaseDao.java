package javaexp.a08_db;
import javaexp.a04_vo.Dept;
import javaexp.a04_vo.Emp;
import javaexp.a04_vo.Emp2;
import javaexp.a04_vo.Emp3;
import javaexp.a04_vo.Emp4;
import javaexp.a04_vo.EmpDept01;
import javaexp.a04_vo.EmpSal;
import javaexp.a04_vo.EmpSch;
import javaexp.a04_vo.LocsalSch;

import java.sql.*;
import java.util.ArrayList;



public class A03_DatabaseDao {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	// 자원해제 공통 메서드 선언
	void closeRsc() {
		if(rs!=null) {try {
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}
		if(rs!=null) {try {
			stmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}
		if(rs!=null) {try {
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}
	}

	public void setConn() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("에러발생: " + e.getMessage());
		}
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			con = DriverManager.getConnection(info, "scott", "tiger");
		} catch (SQLException e) {
			System.out.println("에러발생: " + e.getMessage());
		}
		System.out.println("접속성공");

	}

	public void deptList() {
		try {
			setConn();
			stmt = con.createStatement();
			String sql = "SELECT * FROM DEPT";
			rs = stmt.executeQuery(sql);
			int row = 1;
			while (rs.next()) {
				// dept 컬럼 데이터 가져와서 출력하기..
				System.out.print("행"+row+++"\t");
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString(2) + "\t");	// select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+ "\n");	// select를 통해서 데이터 순서로 1부터
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			if (rs != null)
				rs = null;
			if (stmt != null)
				stmt = null;
		}
	}

	// 3. deptlist 기능 메서드
	/*
	 * 1. Dept(deptno, dname, loc) VO 생성 
	 * 2. 리턴할기능 메서드 선언 3. select * from dept where loc like '%'||'A'||'%'; 
	 * 4. while() 처리할 VO 생성하고, ArrayList에 담기 
	 * 5. main()에서 출력처리
	 */
	public ArrayList<Dept> deptList(String loc) {
		ArrayList<Dept> dlist = new ArrayList<Dept>();
		try {
			setConn();
			String sql = "select * \r\n" + "from dept \r\n" + "where loc like '%'||'"+loc+"'||'%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int row = 1;
			while (rs.next()) {
				dlist.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
				// dept 컬럼 데이터 가져와서 출력하기..
				// select deptno, dname, loc from dept
				Dept dept = new Dept();
				System.out.print("행"+row+++"\t");
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString(2) + "\t");	// select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+ "\n");	// select를 통해서 데이터 순서로 1부터
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			if (rs != null)
				rs = null;
			if (stmt != null)
				stmt = null;
			if (con != null)
				con = null;
		}
		return dlist;
	}
	public ArrayList<Emp2> getEmp2List(int deptno){
		ArrayList<Emp2> list = new ArrayList<Emp2>();
		String sql = "\"SELECT empno no, ename name, job, deptno\r\n"
				+ "				FROM emp\r\n"
				+ "			WHERE deptno = \"+deptno;";
		// 연결객체 공통 메서드
		try {
			setConn();
			// 대화객체
			stmt = con.createStatement();
			// 결과객체
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp2(rs.getInt("no"), rs.getString("name"),
								  rs.getString("job"), rs.getInt("deptno")));
			}
			// 자원해제
			rs.close(); stmt.close(); con.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		
		return list;
	}
	/*
	 * ex) 직책을 기준으로 부서명, 사원이름, 직책명, 급여를 검색하여 출력하세요
	 * - VO작성, 동적SQL작성
	 * - 고급자(메서드정의까지)
	 * 
	 * SELECT DNAME, ENAME, JOB, SAL
	FROM EMP e, DEPT d
	WHERE e.DEPTNO  = d.DEPTNO 
	AND JOB LIKE '%'||'MAN'||'%'
	 */
	public ArrayList<Emp3> list3(String job){
		ArrayList<Emp3> list = new ArrayList<Emp3>();
		String sql = "SELECT DNAME, ENAME, JOB, SAL\r\n"
				+ "FROM EMP e, DEPT d\r\n"
				+ "WHERE e.DEPTNO  = d.DEPTNO \r\n"
				+ "AND JOB LIKE '%'||'MAN'||'%'";
		try {
			setConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Emp3(rs.getString(1),rs.getString(2),
								  rs.getString(3),rs.getDouble(4)));
			}
			rs.close(); stmt.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			closeRsc();	// 자원해제 공통 메서드.
		}
		return list;
	}
	/*
	 * ex) 관리자번호를 기준으로 사원번호, 사원명, 관리자번호, 급여를 검색하는 VO, sql작성
	 * 	1) sql 작성
	 * 	2) vo 작성
	 * 	3) 기능 메서드 작성 - 리턴값, 매개변수
	 * 	4) 동적 sql 작성
	 */
	public ArrayList<Emp4> list4(int mgr){
		ArrayList<Emp4> list = new ArrayList<Emp4>();
		String sql = "SELECT EMPNO,ENAME,MGR,SAL \r\n"
				+ "FROM EMP e \r\n"
				+ "WHERE MGR LIKE '%'||''||'%'";
		return list;
	}
	/*
	 * 위와 같이 매개변수로 처리할 데이터가 많을 때
	 * 1. 매개변수를 나열하든지
	 * 2., 위 매개변수를 객체로 VO를 만들고 그 VO로 매개변수를 전송하게 한다.
	 * class EmpSch{
	 * 	private String ename;
	 * 	private String job;
	 * 	private int ft_sal;
	 * 	private int to_sal;
	 * 	private int deptno;
	 * }
	 */
	public ArrayList<Emp> getEmpListSch(EmpSch sch){
		ArrayList<Emp> list = new ArrayList<Emp>();
		String sql=("SELECT *\r\n"
				+ "FROM EMP e \r\n"
				+ "WHERE ENAME LIKE '%"+sch.getEname()+"%'\r\n"
				+ "AND JOB LIKE '%"+sch.getJob()+"%'\r\n"
				+ "AND SAL BETWEEN "+sch.getFr_sal()+ "AND "+sch.getTo_sal()+"\r\n"
				+ "AND DEPTNO = "+sch.getDeptno());
		return list;
	}
	public ArrayList<EmpSal> getSalGrade(int sal){
		ArrayList<EmpSal> list = new ArrayList<EmpSal>();
		String sql = "SELECT ENAME ,grade, sal"+
					"FROM EMP e ,SALGRADE s"+
					"WHERE e.SAL BETWEEN losal AND hisal"+
					"AND SAL = "+sal;
		return list;
	}
	public ArrayList<EmpDept01> empDeptSch(LocsalSch sch){
		ArrayList<EmpDept01> list = new ArrayList<EmpDept01>();
		String sql = "SELECT e.*, d.LOC "+
					 "FROM EMP e , DEPT d "+
					 "WHERE e.DEPTNO  = d.DEPTNO  "+
					 "AND loc LIKE '%'||'"+sch.getLoc()+"'||'%'"+
					 "AND sal BETWEEN "+sch.getFr_sal()+" AND "+sch.getTo_sal();
		return list;
	}
	public static void main(String[] args) {
		A03_DatabaseDao dao = new A03_DatabaseDao();
		dao.deptList();
		ArrayList<Dept> dlist = dao.deptList("A");
		System.out.println(" # 화면 출력 내용 #");
		for(Dept d:dlist) {
			System.out.print(d.getDeptno()+"\t");
			System.out.print(d.getDname()+"\t");
			System.out.print(d.getLoc()+"\n");
		}
	}

}
