package com.jspider.solidprinciples.dip;

public class HelperClass
{
	public static Product getProduct()
	{
		Product product =new ProductDatabase();
		return product;
	}
}
