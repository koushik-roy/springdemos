package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/properties/config.xml");

		Locations loc = (Locations) context.getBean("locations");

		System.out.println(loc);
	}
}
