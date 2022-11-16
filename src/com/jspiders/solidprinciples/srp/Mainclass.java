package com.jspiders.solidprinciples.srp;

public class Mainclass
{
	public static void main(String[] args) 
	{
		Student std=new Student(101,"Smith",87.5);

		StudentDatabase.insert();
		StudentDatabase.read();
		StudentDatabase.deleted();
		StudentDatabase.updated();
	}
}
