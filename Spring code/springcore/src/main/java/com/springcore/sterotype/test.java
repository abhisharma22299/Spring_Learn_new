package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/config.xml");

	Student bean = context.getBean("student",Student.class);
//bean.setCity("srilanka");
//bean.setName("rampol");
//	
System.out.println(bean);
System.out.println(bean.getList());
}
}