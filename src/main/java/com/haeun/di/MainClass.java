package com.haeun.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
	     
	      
	      String config = "classpath:applicationCTX.xml";
	      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // °´Ã¼ »ý¼º
	      StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
	      //bean id, Å¬·¡½º
	      
	      Student student2 = ctx.getBean("student2", Student.class);
	      
	      studentInfo.getStudentInfo();
	      studentInfo.setStu(student2);
	      studentInfo.getStudentInfo();
	      
	      ctx.close(); // »ç¿ë ÈÄ ´Ý¾ÆÁà¾ßÇÔ
	   }
}
