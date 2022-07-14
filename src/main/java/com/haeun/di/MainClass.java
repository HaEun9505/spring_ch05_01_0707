package com.haeun.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
	     
	      
	      String config = "classpath:applicationCTX.xml";
	      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // 객체 생성
	      StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
	      //bean id, 클래스
	      
	      Student student2 = ctx.getBean("student2", Student.class);
	      
	      studentInfo.getStudentInfo();
	      studentInfo.setStu(student2);
	      studentInfo.getStudentInfo();
	      
	      ctx.close(); // 사용 후 닫아줘야함
	   }
}