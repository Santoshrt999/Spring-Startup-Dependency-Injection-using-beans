package com.springtesting;

public class Address {

	private String streetname;
	private int zipcode;

	public Address(String streetname, int zipcode) {
		super();
		this.streetname = streetname;
		this.zipcode = zipcode;

	}

	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", zipcode=" + zipcode + "]";
	}

}
