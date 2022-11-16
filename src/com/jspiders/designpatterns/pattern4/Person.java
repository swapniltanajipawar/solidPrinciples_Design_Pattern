package com.jspiders.designpatterns.pattern4;

public class Person implements Cloneable 
{
	int id;
	String name;
	Address address;
	public Person(int id, String name, Address address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{

		return new Person(id,name,address);

	}
}