package javaexp.a06_object;

import java.util.ArrayList;

public class A10_ObjVsArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchClass s1 = new SchClass("1");
		s1.addStudent(new Student(1, "전준혁"));
		s1.studentList();
	}

}

class Student {
	private int num;
	private String name;

	public Student() {
	}

	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class SchClass {
	private String name;
	private ArrayList<Student> slist;

	public SchClass() {
		slist = new ArrayList<Student>();
	}

	public SchClass(String name) {
		this.name = name;
		slist = new ArrayList<Student>();
	}

	public void addStudent(Student stud) {
		System.out.println("# 학생의 추가 #");
		System.out.println(stud.getName() + " 추가 처리");
		slist.add(stud);
	}

	public void studentList() {
		System.out.println("반 이름:" + name);
		if (slist.size() > 0) {
			for (Student stu : slist) {
				System.out.print(stu.getNum()+"\t");
				System.out.print(stu.getName()+"\n");
			}
		}else {
			System.out.println("등록된 학생이 없습니다!!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getSlist() {
		return slist;
	}

	public void setSlist(ArrayList<Student> slist) {
		this.slist = slist;
	}

}