package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Component("obj")
public class Student {
@Value("ram")
	private String name;
@Value("no")
private String city;
@Value("#{temp}")
private List<String> list;

public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public Student(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


	
}