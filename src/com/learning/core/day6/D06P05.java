package com.learning.core.day6;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price,o.price);
    }
}

public class D06P05  {
    public static void main(String[] args) {
        TreeMap<Car, Integer> carMap = new TreeMap<>();

       
        carMap.put(new Car("Bugatti", 80050.0), 1);
        carMap.put(new Car("Swift", 305000.0), 2);
        carMap.put(new Car("Audi", 600100.0), 3);
        carMap.put(new Car("Benz", 900000.0), 4);

    
        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        }
    }

