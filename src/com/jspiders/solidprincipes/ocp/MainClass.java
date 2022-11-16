package com.jspiders.solidprincipes.ocp;

public class MainClass
{
	public static void main(String[] args) 
	{
		Customer customer= new FarmerLoanCustomer();
		double discount =DiscountCalculator.claculator(customer);
		System.out.println(discount);
		
	}
}
