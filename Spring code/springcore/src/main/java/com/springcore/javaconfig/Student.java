package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component()
public class Student {
	private Samosa samosa;
	
@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

public void study()
{
	this.samosa.display();
System.out.println("Studing");	
}
}
