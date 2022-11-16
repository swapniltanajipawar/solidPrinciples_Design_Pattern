package com.jspiders.solidprinciples.isp;

public class MainClass
{
	public static void main(String[] args) 
	{
		HpMachine hp=new HpMachine();
		hp.print();
		System.out.println("------------------------------");

		EpsonMachine epson=new EpsonMachine();
		epson.print();
		epson.scan();
		System.out.println("------------------------------");

		CanonMachine canon=new CanonMachine();
		canon.print();
		canon.scan();
		canon.fax();
	}
}
