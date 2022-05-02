package com.springdemos.springcore.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/interfaceinjection/config.xml");

		// get the employee the bean from the container
		Coach c = (Coach) context.getBean("coach");
		// Employee emp2= new Employee(1, "John");

		// display the bean
		System.out.println(c);
	}
}
