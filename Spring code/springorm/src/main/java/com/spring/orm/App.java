package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
StudentDao studentDao=	context.getBean("studentDao",StudentDao.class);
Student studnet=new Student(1,"abhu","ay");
    studentDao.insert(studnet);		
    }
}
