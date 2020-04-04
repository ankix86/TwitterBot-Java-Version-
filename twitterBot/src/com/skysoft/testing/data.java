package com.skysoft.testing;

public class data {
	String name;
	float price;
	boolean isAwesome;
	
	public data(String name,float price,boolean isawesome){
	{
		this.name = name;
		this.price = price;
		this.isAwesome = isawesome;
		
		System.out.println("name :" +  this.name + "price :"+this.price + "isAwesome :"+ this.isAwesome);
		}
	}
}
