package com.jspiders.designpatterns.pattern3;

public class Mainclass 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Person person1=new Person(101,"King");

		//cloned Object
		//Shallow Cloning
		//Person person2=new Person();
		//person2.name="Queen";

		//Deep Cloning
		Person person2=(Person)person1.clone();
		person2.name="Queen";

		System.out.println("person1:"+person1);
		System.out.println("person2:"+person2);

	}
}
