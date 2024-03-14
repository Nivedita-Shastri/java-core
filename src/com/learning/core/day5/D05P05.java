package com.learning.core.day5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Remove {
    private String productid;
    private String productname;

    public Remove(String productid, String productname) {
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

public class D05P05 {

    public static void main(String[] args) {

        HashSet<Remove> cars = new HashSet<>();

        cars.add(new Remove("P001", "Maruti 800"));
        cars.add(new Remove("P002", "Maruti Zen"));
        cars.add(new Remove("P003", "Maruti Dezire"));
        cars.add(new Remove("P004", "Maruti Alto"));
        Scanner sc=new Scanner(System.in);
        String productIdToRemove = sc.nextLine(); 

       
        Iterator<Remove> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Remove car = iterator.next();
            if (car.getProductid().equals(productIdToRemove)) {
                iterator.remove(); 
            }
        }

       
        for (Remove car : cars) {
            System.out.println(car);
        }
    }
}

