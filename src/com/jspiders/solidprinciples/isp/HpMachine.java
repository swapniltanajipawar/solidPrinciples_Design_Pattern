package com.jspiders.solidprinciples.isp;

public class HpMachine implements PrintMachine 
{
	@Override
	public void print()
	{
		System.out.println("Print service by HpMachine");
	}
}
