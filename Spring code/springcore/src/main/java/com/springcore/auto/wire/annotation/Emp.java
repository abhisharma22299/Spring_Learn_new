package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address")
private Address address;


public Emp(Address adress) {
	super();
	this.address = adress;
}

@Override
public String toString() {
	return "Emp [adress=" + address + "]";
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Address getAdress() {
	return address;
}

public void setAdress(Address adress) {
	this.address = adress;
}

}