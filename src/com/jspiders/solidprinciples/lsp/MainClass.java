package com.jspiders.solidprinciples.lsp;

import java.util.ArrayList;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Parrot parrot=new Parrot();
		Pegion pegion =new Pegion();
		//Ostrich ostrich =new Ostrich();
		ArrayList<Bird> list=new ArrayList<Bird>();
		list.add(parrot);
		list.add(pegion);
		
		for(int i=0;i<list.size(); i++)
		{
			Bird bird=list.get(i);
			bird.fly();
		}
		
	}
}
