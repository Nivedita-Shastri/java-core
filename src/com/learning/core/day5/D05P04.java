package com.learning.core.day5;

	import java.util.HashSet;
import java.util.Scanner;

	class Cars {
	    private String productid;
	    private String productname;

	    public Cars(String productid, String productname) {
	        this.productid = productid;
	        this.productname = productname;
	    }

	    public String getProductid() {
	        return productid;
	    }

	    public String getProductname() {
	        return productname;
	    }

	    @Override
	    public String toString() {
	        return productid + " " + productname;
	    }
	}

	public class D05P04 {

	    public static void main(String[] args) {

	        HashSet<Cars> cars = new HashSet<>();

	        cars.add(new Cars("P001", "Maruti 800"));
	        cars.add(new Cars("P002", "Maruti Zen"));
	        cars.add(new Cars("P003", "Maruti Dezire"));
	        cars.add(new Cars("P004", "Maruti Alto"));
            Scanner sc=new Scanner(System.in);
            String searchid = sc.nextLine();
            String searchcar=sc.nextLine();

	        boolean found = false;
	        for (Cars car : cars) {
	            if (car.getProductid().equals(searchid) && car.getProductname().equals(searchcar)) {
	                found = true;
	                System.out.println("Product Found");
	                break; 
	            }
	        }

	        if (!found) {
	            System.out.println("Product not found");
	        }
	    }
	}



