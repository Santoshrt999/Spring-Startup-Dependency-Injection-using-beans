package com.springtesting;

public class Person {

	private int id;
	private String name;
	private int taxid;
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}

	public int getTaxid() {
		return taxid;
	}

	public Person() {
		// super();
	}

	public Person(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello world!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxid=" + taxid + ", address=" + address + "]";
	}



}
