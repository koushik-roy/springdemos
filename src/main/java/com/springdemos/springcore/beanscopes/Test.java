package com.springdemos.springcore.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/beanscopes/config.xml");

		Address ad1 = (Address) context.getBean("address");
		System.out.println(ad1);
	}
}
