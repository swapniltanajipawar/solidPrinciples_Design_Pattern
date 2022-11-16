package com.jspiders.designpatterns.pattern4;

public class Address implements Cloneable 
{
	String state;
	String city;
	int pincode;

	public Address(String state, String city, int pincode)
	{
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return new Address(state, city , pincode);
	}

}
