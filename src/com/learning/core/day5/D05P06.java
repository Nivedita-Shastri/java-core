package com.learning.core.day5;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    public int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }
}
public class D05P06 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

       
        personSet.add(new Person(1, "Sarita", 22, 1500.0));
        personSet.add(new Person(2, "Vanita", 20, 2000.0));
        personSet.add(new Person(3, "Lalita", 20, 2500.0));
        personSet.add(new Person(4, "Neeta", 25, 3000.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));

     
        for (Person person : personSet) {
            if (person.age > 25) {
                System.out.println(person);
            }
        }
    }
}
