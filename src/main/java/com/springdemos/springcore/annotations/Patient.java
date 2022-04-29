package com.springdemos.springcore.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PreDestroy
	private void bye() {
		System.out.println("inside bye method");

	}
	@PostConstruct
	private void hi() {
		System.out.println("Inside hi method");

	}

}
