package com.jspiders.designpatterns.pattern5;

public class PersonAddressBuilder1 extends PersonBuilder1
{

	public PersonAddressBuilder1(Person person)
	{
		this.person=person;
	}
	public PersonAddressBuilder1 stateIs(String state) 
	{
		this.person.state=state;
		return this;
	}
	public PersonAddressBuilder1 cityIs(String city)
	{
		this.person.city=city;
		return this;
	}
	
	public PersonAddressBuilder1 pincodeIs(int pincode) 
	{
		this.person.pincode=pincode;
		return this;
	}

}
