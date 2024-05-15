package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
Student bean = context.getBean("getStudent",Student.class);
bean.study();
	}
}
