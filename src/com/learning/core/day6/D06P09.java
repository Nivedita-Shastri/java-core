package com.learning.core.day6;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

 class Car7 implements Comparable<Car7> {
    private String name;
    private double price;

    public Car7(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car7 car = (Car7) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Car7 other) {
        return name.compareTo(other.name); 
    }
}

public class D06P09 {
    public static void main(String[] args) {
    	
    	TreeMap<String, Car7> carMap = new TreeMap<>();

        carMap.put("Swift", new Car7("Swift", 500000.0));
        carMap.put("Innova", new Car7("Innova", 1200000.0));
        carMap.put("Creta", new Car7("Creta", 850000.0));
        carMap.put("Reva", new Car7("Reva", 80000.0));
        Scanner scanner=new Scanner(System.in);
        double newPrice = scanner.nextDouble();

        if (carMap.containsKey("Reva")) {
            Car7 updatedCar = new Car7("Reva", newPrice);
            carMap.put("Reva", updatedCar); 
            System.out.println("Reva " + newPrice);
        } else {
            System.out.println("Key not found.");
        }
    }
}