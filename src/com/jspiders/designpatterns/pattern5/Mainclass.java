package com.jspiders.designpatterns.pattern5;
public class Mainclass 
{
	public static void main(String[] args)
	{
		//Way-1
		/*
		 * PersonBuilder1 personBuilder1=new PersonBuilder1(); 
		 * Person person=personBuilder1.build();
		 * 
		 * PersonJobBuilder1 jobBuilder = personBuilder1.works();
		 * jobBuilder.CompanyIs("Amdocs"); jobBuilder.positionIs("Java Developer");
		 * jobBuilder.salaryIs(50000.0);
		 * 
		 * PersonAddressBuilder1 addressBuilder = personBuilder1.lives();
		 * addressBuilder.stateIs("Maharashtra"); addressBuilder.cityIs("Mumbai");
		 * addressBuilder.pincodeIs(411030);
		 * 
		 * System.out.println(person);
		 */

		//WAY-2
		PersonBuilder1 personBuilder1=new PersonBuilder1(); 
		Person person=personBuilder1.
				works()
				.CompanyIs("Microsoft")
				.positionIs("Java developer")
				.salaryIs(52000.0)
				.lives()
				.stateIs("maharashtra")
				.cityIs("mumbai")
				.pincodeIs(413304)		
				.build();
		System.out.println(person);
	}
}
