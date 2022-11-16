package com.jspiders.designpatterns.pattern3;

public class Person implements Cloneable
{
	int id;
	String name;
	public Person(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + "]";
	}

@Override
protected Object clone() throws CloneNotSupportedException
{
	return new Person(id,name);
}
}
