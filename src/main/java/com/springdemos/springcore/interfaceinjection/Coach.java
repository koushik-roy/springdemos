package com.springdemos.springcore.interfaceinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Coach {
	@Value("23")
	private int id;
	@Value("John")
	private String name;
	@Autowired
	@Qualifier("basketball") // qualifier always maps to the respective class in camelCase
	private Sport sport;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport=" + sport.play() + "]";
	}




	

}
