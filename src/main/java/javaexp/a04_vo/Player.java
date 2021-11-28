package javaexp.a04_vo;
// javaexp.a04_vo.Player
// 클래스를 만들면 ctrl+s를 두세번 눌러준다.
// ==> 컴파일 과정을 거침
public class Player {
	private String name;
	private String part;
	private String team;
	private double record;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String name, String part, String team, double record) {
		super();
		this.name = name;
		this.part = part;
		this.team = team;
		this.record = record;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public double getRecord() {
		return record;
	}
	public void setRecord(double record) {
		this.record = record;
	}
	
}
