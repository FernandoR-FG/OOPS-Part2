package com.javacourse.oops2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("line 1","Centro","500");
		Customer customer = new Customer("Fernando", homeAddress);
		Address workAddress = new Address("line 1","Centro","500");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
