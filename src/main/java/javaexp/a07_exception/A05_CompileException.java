package javaexp.a07_exception;

import java.io.File;
import java.io.IOException;

public class A05_CompileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 컴파일예외의 경우 바로 왼쪽에 에러가 표기되고,
		// 이 예외를 처리하여야 수행이 가능하다.
		try {
			Class driver1 = Class.forName("java.oracle.JDBCDriver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("컴파일 예외 발생" + e.getMessage());
		}

		// io(input/output)처리가 일어나는 객체
		// DB연동시
		File f = new File("");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

		// # 실행예외는 실행했는 때, 예외가 발생하는 것을 말한다.
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("실행 예외 발생" + e.getMessage());
		}

	}

}
