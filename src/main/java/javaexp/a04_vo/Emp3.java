package javaexp.a04_vo;

public class Emp3 {
	private String dname;
	private String ename;
	private String job;
	private int deptno;
	public Emp3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp3(String dname, String ename, String job, int deptno) {
		super();
		this.dname = dname;
		this.ename = ename;
		this.job = job;
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
