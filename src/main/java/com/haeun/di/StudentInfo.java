
package com.haeun.di;

public class StudentInfo {
	
	private Student stu;
	
	//Student로 만든 객체 생성자로 초기화
	public StudentInfo(Student stu) {
		super();
		this.stu = stu;
	}
	
	public void getStudentInfo() {
		System.out.println("이름 : "+stu.getName());
		System.out.println("나이 : "+stu.getAge());
		System.out.println("학년 : "+stu.getGrade());
		System.out.println("반 : "+stu.getClassNum());
		
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}
