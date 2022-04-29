package com.springdemos.springcore.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/annotations/config.xml");
		context.registerShutdownHook();
		

		// get the employee the bean from the container
		Patient p = (Patient) context.getBean("patients");
		// Employee emp2= new Employee(1, "John");

		// display the bean
		System.out.println(p);
	}
}
