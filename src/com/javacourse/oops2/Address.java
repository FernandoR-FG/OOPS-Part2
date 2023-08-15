package com.javacourse.oops2;

public class Address {
	private String line;
	private String city;
	private String zip;
	
	
	//creation
	public Address(String line, String city, String zip) {
		super();
		this.line = line;
		this.city = city;
		this.zip = zip;
	}
	
	public String toString() {
		return String.format("Line 1 - %s city - %s zip - %s", line, city,zip);
	}
}
