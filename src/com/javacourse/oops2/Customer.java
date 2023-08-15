package com.javacourse.oops2;

public class Customer {
	private String name;
	//Customer contiene la referencia a otro objeto
	//Cliente contiene un atributo objeto que es address 
	//Esto se conoce como composicion de objetos
	private Address homeAddress;
	private Address workAddress;
	
	//creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	//Operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name - [%s] - homeAddress - [%s] - workAddress - [%s] ", name,homeAddress,workAddress);
	}
	
	
}
