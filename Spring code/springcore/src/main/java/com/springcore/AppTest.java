package com.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	Student student = (Student)context.getBean("student1");
	
	Student student1 = (Student)context.getBean("student2");
	
	System.out.println(student);
	
	System.out.println(student1);
    
    }
}
