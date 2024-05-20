	package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
//    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
        System.out.println( "Hello World!" );
 StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
 List<Student> student = studentDao.getAllStudent();
 
for (Student student2 : student) {
	System.out.println(student2);
}
    }
}