package javaexp.a04_vo;

public class A04_Screen {
	private String title;
	private int pay;
	private int cnt;
	
	
	public A04_Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A04_Screen(String title, int pay, int cnt) {
		super();
		this.title = title;
		this.pay = pay;
		this.cnt = cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
