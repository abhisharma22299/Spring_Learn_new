package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class EmpTest {
public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
	Emp student = (Emp)context.getBean("emp1");
	Emp student1 = (Emp)context.getBean("emp1");
	System.out.println(student);
	System.out.println(student1);
}
}