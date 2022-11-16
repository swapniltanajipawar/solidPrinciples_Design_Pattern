package com.jspiders.solidprincipes.ocp;

public class GoldLoanCustomer implements Customer
{
	@Override
	public boolean isCustomerLoyal()
	{
		return false;
	}
}
