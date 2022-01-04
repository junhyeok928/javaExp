package javaexp.a07_exception;

public class A04_MandateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 예외의 위임
		 * 1. 예외는 메서드 단위로 위임할 수있다,.
		 * 		위임된 예외는 해당 메서드가 호출하는 순간 한꺼번에 처리가
		 * 		가능하다.
		 * 		1) 기본적으로 예외는 예외 처리형식으로 그때그때 아래 형식으로 처리
		 * 			try{
		 * 				예외발생할 가망성이 있는 코드
		 * 			}catch(예외){
		 * 				
		 * 			}
		 * 		2) 메서드단위로 위와같이 처리할 내용을 호출하는 곳에서 한꺼번에
		 * 			처리할 필요성이 있을 때, 사용한다.
		 * 			public void 메서드단위() thows ClassNotFoundException{}
		 * 			각 메서드에 있는 예외처리 내용을 메서드단위로 위임하여 처리하는 것을 말한다.
		 * 		3) 위임된 메서드가 호출하면 다시 try{} catch(){} 구문을 통해서 한꺼번에 처리하는 것을 말한다.
		 * 
		 * 2. 기본 형식
		 * 		1) 메서드명 throws 위임된 예외1, 위임된 예외2{}
		 */
		DBConn db = new DBConn();
		db.oraDBConn();
		// 예외가 위임되었기 떄문에 예외를 처리하라고 메시지가 뜬가
		try {
			// 한꺼번에 위임되 내용을 처리
			db.mySqlDBConn();	
			db.msSqlDBConn();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		
		
		try {
			// 실행예외라서 자동처리는 나타나지 않지만, 위임되어 처리되는 곳에 예외를 처리하여야 한다.
			db.method01();
			db.method02();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null 예외 처리:"+e.getMessage());
		}
	}

}
class DBConn{
	public void method01() throws NullPointerException{
		String s=null;
		System.out.println(s.toString());
	}
	public void method02() throws NullPointerException{
		String s2=null;
		System.out.println(s2.toString());
	}
	public void method03(){
		String s3=null;
		try {
			System.out.println(s3.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void oraDBConn() {
		// 예외를 바로 처리한 경우
		System.out.println("오라클 DB연결");
		// 예외의 두번째 형태인 컴파일예외로 반드시 처리하여야 되는 내용
		try {
			Class driver1 = Class.forName("java.oracle.JDBCDriver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외:" +e.getMessage());
		}
	}
	public void mySqlDBConn() throws ClassNotFoundException{
		// 예외를 위임한 경우..
		System.out.println("mysql DB연결");
		Class driver2 = Class.forName("jaba.mysql.JDBCriver");
	}
	public void msSqlDBConn() throws ClassNotFoundException{
		System.out.println("mysql DB연결");
		Class driver2 = Class.forName("jaba.mysql.JDBCriver");
	}
}