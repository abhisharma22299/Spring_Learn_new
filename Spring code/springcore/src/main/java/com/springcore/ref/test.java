package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class test {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref.xml");
	
	A student = (A)context.getBean("A");
	
	
	System.out.println(student);
	
	
}
}
