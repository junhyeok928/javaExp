package javaexp.a06_object;

public class A05_MethodObjParam {
	/*
	# 매개변수를 객체를 통한 처리.
	1. 메서드의 매개변수를 객체로 선언하고, 해당 메서드의 매개변수로
		객체를 전달하여 처리하는 방식을 말한다.
		public void paramObj(Member m){}
		
		p01.paramObj(new Member());
	2. 
	 */
	static void regMember(Member m) {
		System.out.println("# 회원가입 정보 #");
		System.out.println("아이디:"+m.getId());
		System.out.println("패스워드:"+m.getPass());
		System.out.println("이름:"+m.getName());
		System.out.println("포인트:"+m.getPoint());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("himan","7777","홍길동",1000);
		regMember(m);
		regMember(new Member("goodMan","8888","신길동",2000));
	}

}
class Member{
	String id;
	private String pass;
	private String name;
	private int point;
	public String getId() {
		return id;
	}
	public Member(String id, String pass, String name, int point) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.point = point;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}