package com.jspiders.designpatterns.pattern5;
public class Person
{
	//company Employee job details:
	String company;
	String position;
	double salary;

	//Employee Address Details
	String state;
	String city;
	int pincode;

	@Override
	public String toString() 
	{
		return "Person [company=" + company + ", position=" + position + ", salary=" + salary + ", state=" + state
				+ ", city=" + city + ", pincode=" + pincode + "]";
	}
	//to string method we use to print the all data members in console
	//Industry we will not use methods for to print info of data members.

}
