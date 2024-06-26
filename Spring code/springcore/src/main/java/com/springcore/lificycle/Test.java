package com.springcore.lificycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lificycle/config.xml");
		Samosa s = (Samosa) context.getBean("s1");
		context.registerShutdownHook();
		System.out.println(s);
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		Pepsi p = (Pepsi) context.getBean("p1");
		
		System.out.println(p);	System.out.println("+++++++++++++++++++++++++++++++++");
		Example e= (Example) context.getBean("e1");
		System.out.println(e);
		
		System.out.println("++++++++++++++++++++++++++++++");
	
	}
}
