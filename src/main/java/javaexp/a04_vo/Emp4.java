package javaexp.a04_vo;

public class Emp4 {
	private int empno;
	private String ename;
	private int mgr;
	private int sal;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp4(int empno, String ename, int mgr, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.mgr = mgr;
		this.sal = sal;
	}
	public Emp4() {
		super();
		// TODO Auto-generated constructor stub
	}
}
