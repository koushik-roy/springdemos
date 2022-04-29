package com.springdemos.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/dependencycheck/config.xml");

		Prescription p = (Prescription) context.getBean("presc");

		// display the bean
		System.out.println(p);
	}
}
