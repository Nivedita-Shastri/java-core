package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Candy implements Comparable<Candy> 
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Candy(int id, String name, int age, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public double getSalary() 
    {
        return salary;
    }

    @Override
    public String toString() 
    {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Candy person = (Candy) obj;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Candy other) 
    {
        return Integer.compare(this.id, other.id);
    }

	
}

public class D05P10 
{
    public static void main(String[] args) 
    {
        TreeSet<Candy> people = new TreeSet<>();
        
        people.add(new Candy(1, "lalita", 30, 50));
        people.add(new Candy(2, "Anita", 25, 600));
        people.add(new Candy(3, "Sarita", 35, 6700));
        people.add(new Candy(4, "Jones", 22, 6999));
        people.add(new Candy(5, "Jonny", 28, 60));
        people.add(new Candy(6, "Ron", 40, 7000));

        
        for (Candy person : people) 
        {
            if (person.getName().startsWith("J")) 
            {
                System.out.println(person);
                break;
            }
        }
    }
}