package com.learning.core.day6;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;

    public Car3(String name, double price) {
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
        Car3 car = (Car3) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car3 o) {
        return Double.compare(this.price,o.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car3, Integer> carMap = new TreeMap<>();

        carMap.put(new Car3("Bugatti", 80050.0), 1);
        carMap.put(new Car3("Swift", 305000.0), 2);
        carMap.put(new Car3("Audi", 600100.0), 3);
        carMap.put(new Car3("Benz", 900000.0), 4);
        Entry<Car3, Integer> highest = carMap.pollFirstEntry();
        
        for (Entry<Car3, Integer> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
