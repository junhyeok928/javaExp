package javaexp.a04_vo;

public class A03_Hobby {
	private String name;
	private int pay;
	private String time;
	
	public A03_Hobby() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A03_Hobby(String name, int pay, String time) {
		super();
		this.name = name;
		this.pay = pay;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
