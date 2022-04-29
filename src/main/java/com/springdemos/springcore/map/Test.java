package com.springdemos.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/map/config.xml");

		// get the employee the bean from the container
		Customer c = (Customer) context.getBean("customer");
		// Employee emp2= new Employee(1, "John");

		// display the bean
		System.out.println(c);
	}
}
