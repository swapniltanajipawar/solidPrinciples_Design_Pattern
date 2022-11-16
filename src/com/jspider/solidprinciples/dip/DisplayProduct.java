package com.jspider.solidprinciples.dip;

public class DisplayProduct
{
	Product product;
	public DisplayProduct(Product product)
	{
		this.product=product;
	}
	public void display()
	{
		int numberofProducts= product.read();
		System.out.println("Products per Page is:"+numberofProducts/10);

	}
}
