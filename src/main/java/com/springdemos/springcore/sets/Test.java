package com.springdemos.springcore.sets;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/sets/config.xml");

		// get the employee the bean from the container
		CarDealer h = (CarDealer) context.getBean("cardealer");
		// Employee emp2= new Employee(1, "John");

		// display the bean
		System.out.println(h);
	}
}
