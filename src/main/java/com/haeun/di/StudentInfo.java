package com.haeun.di;

public class StudentInfo {
	
	private Student stu;
	
	//Student�� ���� ��ü �����ڷ� �ʱ�ȭ
	public StudentInfo(Student stu) {
		super();
		this.stu = stu;
	}
	
	public void getStudentInfo() {
		System.out.println("�̸� : "+stu.getName());
		System.out.println("���� : "+stu.getAge());
		System.out.println("�г� : "+stu.getGrade());
		System.out.println("�� : "+stu.getClassNum());
		
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
}
