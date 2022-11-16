package com.jspiders.designpatterns.pattern4;

public class Mainclass
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address address=new Address("Karanatak", "Banglore", 413304);
		Person person1=new Person(101, "King",address);
		//cloned Object
//		Person person2=person1;
		//person.name="Queen";

		//Deep Cloning
		Person person2=(Person)person1.clone();
		person2.address.pincode=411030;
		System.out.println("Person1:"+person1);
		System.out.println("Person2:"+person2);
	}
}
