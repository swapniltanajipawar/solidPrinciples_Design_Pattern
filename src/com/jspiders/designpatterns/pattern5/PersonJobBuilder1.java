package com.jspiders.designpatterns.pattern5;
public class PersonJobBuilder1 extends PersonBuilder1
{

	public PersonJobBuilder1(Person person)
	{
		this.person=person;
	}
	
	public PersonJobBuilder1 CompanyIs(String company)
	{
		this.person.company=company;
		return this;
	}
	
	public PersonJobBuilder1 positionIs(String position)
	{
		this.person.position=position;
		return this;
	}
	
	public PersonJobBuilder1 salaryIs(double salary)
	{
		this.person.salary=salary;
		return this;
	}

}
