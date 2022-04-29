package com.springdemos.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/list/config.xml");

		// get the employee the bean from the container
		Hospital h = (Hospital) context.getBean("hospital");
		// Employee emp2= new Employee(1, "John");

		// display the bean
		System.out.println(h);
	}
}
