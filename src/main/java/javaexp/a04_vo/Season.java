package javaexp.a04_vo;
// javaexp.a04_vo.Season
public class Season {
	private String sname;
	private String weather;
	private String priod;
	public Season() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Season(String sname, String weather, String priod) {
		super();
		this.sname = sname;
		this.weather = weather;
		this.priod = priod;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getPriod() {
		return priod;
	}
	public void setPriod(String priod) {
		this.priod = priod;
	}
	
}
