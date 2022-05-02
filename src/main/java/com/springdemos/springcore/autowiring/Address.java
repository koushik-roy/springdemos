package com.springdemos.springcore.autowiring;

public class Address {
	int housenumber;
	String street;
	String city;

	public Address(int housenumber, String street, String city) {
		super();
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
	}

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", street=" + street + ", city=" + city + "]";
	}

}
