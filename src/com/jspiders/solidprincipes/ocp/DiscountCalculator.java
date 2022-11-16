package com.jspiders.solidprincipes.ocp;

public class DiscountCalculator 
{
	static double discount=20.0;
	public static double claculator(Customer customer)//to make this method as generic 
	{
		if(customer.isCustomerLoyal())
		{
			discount= discount*1.5;
		}
		return discount;
	}
}
