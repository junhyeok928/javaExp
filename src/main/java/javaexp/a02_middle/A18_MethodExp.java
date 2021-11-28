package javaexp.a02_middle;

public class A18_MethodExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music02 m01 = new Music02("즐거운 음악");
		String mname = m01.getMname();
		System.out.println("리턴된 음악:"+mname);
	}

}
// ex) Music02 클래스 선언하고, 생성자를 통해 필드에 음악명을 입력하고,
//    getMname()를 통해 리턴한 음악명을 출력하세요.
class Music02{
	String mname;
	Music02(String mname){
		this.mname = mname;
	}
	
	String getMname() {
		return mname;
	}
	
}