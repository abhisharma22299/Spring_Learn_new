package com.springcore.lificycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

public class Pepsi implements InitializingBean,DisposableBean {
private double price;

public Pepsi(double price) {
	super();
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("taking pepsi :init S");
}

@Override
public void destroy() throws Exception {
	System.out.println("Going to put bottle back to shop:destory");
}

}
