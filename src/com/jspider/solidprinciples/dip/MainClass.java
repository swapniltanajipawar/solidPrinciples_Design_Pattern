package com.jspider.solidprinciples.dip;

public class MainClass
{
	public static void main(String[] args)
	{		
		Product product=HelperClass.getProduct();
		DisplayProduct displayProduct=new DisplayProduct(product);
		displayProduct.display();
	}
}
