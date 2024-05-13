package com.springcore.lificycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subject;

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("start");
	}
	@PreDestroy
public void end() {
		System.out.println("End");
	}
}
