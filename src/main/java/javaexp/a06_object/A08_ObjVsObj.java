package javaexp.a06_object;

public class A08_ObjVsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sperson p1 = new Sperson("홍길동");
		p1.setPhone(new Sphone("갤럭시N"));
		p1.showMyPhone();
	}

}

class Sphone {
	private String comp;

	public Sphone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sphone(String comp) {
		super();
		this.comp = comp;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

}

class Sperson {
	private String name;
	private Sphone phone;
	public Sperson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sperson(String name) {
		super();
		this.name = name;
	}
	public void showMyPhone() {
		System.out.println("사용자:"+name);
		if(phone!=null) {
			System.out.println("가지고있는 휴대폰");
			System.out.println(phone.getComp());
		}else {
			System.out.println("휴대폰이 없네요..");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sphone getPhone() {
		return phone;
	}
	public void setPhone(Sphone phone) {
		this.phone = phone;
	}
	
}
