package com.jspiders.designpatterns.pattern5;
public class PersonBuilder1 
{
	protected Person person = new Person();

	public PersonJobBuilder1 works()
	{
		PersonJobBuilder1 jobBuilder= new PersonJobBuilder1(person);
		return jobBuilder;
	}
	
	public PersonAddressBuilder1 lives()
	{
		PersonAddressBuilder1 addressBuilder = new PersonAddressBuilder1(person);
		return addressBuilder;		
	}
	
	public Person build()
	{
		return person;
	}

}
