package com.springdemos.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/reftypes/config.xml");

		// get the employee the bean from the container
		Student st = (Student) context.getBean("student"); // Employee emp2= new Employee(1, "John");

		// display the bean
		System.out.println(st);
	}
}
