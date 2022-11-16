package com.jspiders.designpatterns.pattern1;

public class MainClass
{
	public static void main(String[] args)
	{
		Product user1=Product.getInstance();
		System.out.println(user1.name);
		System.out.println(user1.price);

		Product user2=Product.getInstance();
		System.out.println(user2.name);
		System.out.println(user2.price);
		//10000 users of Amazon
	}
}
/*
  Note-> Singleton Concept is used Here...Static Object creation passing object ref in 
  static classname return type method.

1>If for every user we made the seprate object Area of heap memory will get increase
And it is impossible create such huge application.

2>So, for every user we using same object without creating the new Object.
Thats why the performance of application also increses.


 */