package com.jspiders.solidprinciples.isp;

public class EpsonMachine implements PrintMachine,ScanMachine
{
	@Override
	public void print()
	{
		System.out.println("Print service provided by Epson");
	}
	@Override
	public void scan()
	{
		System.out.println("Scan service provided by Epson");
	}
}
