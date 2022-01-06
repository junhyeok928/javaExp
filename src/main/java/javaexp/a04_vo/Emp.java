package javaexp.a04_vo;

import java.util.Date;

public class Emp {
	private int Empno;
	private String Ename;
	private String EJob;
	private int Mgr;
	private Date Hiredate;
	private Double sal;
	private Double Comm;
	private int Deptno;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String ename, String eJob, int mgr, Date hiredate, Double sal, Double comm, int deptno) {
		super();
		Empno = empno;
		Ename = ename;
		EJob = eJob;
		Mgr = mgr;
		Hiredate = hiredate;
		this.sal = sal;
		Comm = comm;
		Deptno = deptno;
	}
	public int getEmpno() {
		return Empno;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEJob() {
		return EJob;
	}
	public void setEJob(String eJob) {
		EJob = eJob;
	}
	public int getMgr() {
		return Mgr;
	}
	public void setMgr(int mgr) {
		Mgr = mgr;
	}
	public Date getHiredate() {
		return Hiredate;
	}
	public void setHiredate(Date hiredate) {
		Hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return Comm;
	}
	public void setComm(Double comm) {
		Comm = comm;
	}
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int deptno) {
		Deptno = deptno;
	}
	
	

	
	
}
