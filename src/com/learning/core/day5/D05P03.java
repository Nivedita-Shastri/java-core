package com.learning.core.day5;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.naming.ldap.SortControl;
class Car
{
	private String productid;
	private String productname;

	public Car(String productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}
	
	@Override
	public String toString() {
		return  productid + " " + productname;
	}
	
}
	
public class D05P03 
{

	public static void main(String[] args) 
	{
		
		
		LinkedHashSet<Car> c = new LinkedHashSet<>();
		
	  
	    c.add(new Car("P001", "Maruti 800"));
	    c.add(new Car("P002", "Maruti Zen"));
	    c.add(new Car("P003", "Maruti Dezire"));
	    c.add(new Car("P004", "Maruti Alto"));

	  
	    for (Car i : c)
	    {
	      System.out.println(i);
	    }
	
	}
}