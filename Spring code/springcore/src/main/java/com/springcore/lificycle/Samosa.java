package com.springcore.lificycle;

public class Samosa {
private double price;


@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Samosa(double price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public void init() {
	System.out.println("Inside init method ");
}
public void destroy() {
	System.out.println("Inside destory method");
}


}