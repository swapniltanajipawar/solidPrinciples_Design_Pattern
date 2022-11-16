package com.jspiders.solidprinciples.isp;

public class CanonMachine implements PrintMachine,ScanMachine,FaxMachine
{
	@Override
	public void print()
	{
		System.out.println("Print service provided by CanonMachine");
	}
	@Override
	public void scan()
	{
		System.out.println("Scan service provided by CanonMachine");
	}
	@Override
	public void fax()
	{
		System.out.println("fax service provided by CanonMachine");
	}	
}
