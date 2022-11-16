package com.jspiders.designpatterns.pattern1;

public class Product 
{
	static Product product=null;
	String name="Smart Watch";
	double price=100.0;
	
	private Product()
	{
		System.out.println("Object Created......");
	}
	
	public static Product getInstance()
	{
		if(product==null)
		{
			product=new Product();
		}
		return product;
	}
}

