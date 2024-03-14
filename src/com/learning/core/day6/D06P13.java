package com.learning.core.day6;
import java.util.Hashtable;

class Employee3 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee3(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
    	return id + " " + name + " " + designation + " " + department;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee3> employeeTable = new Hashtable<>();

   
        employeeTable.put(1, new Employee3(1, "John", "IT", "Software Engineer"));
        employeeTable.put(2, new Employee3(2, "Smith", "HR", "HR Manager"));
        employeeTable.put(3, new Employee3(3, "Alice", "Finance", "Accountant"));
        employeeTable.put(4, new Employee3(4, "Bob", "Marketing", "Marketing Specialist"));
        employeeTable.put(5, new Employee3(5,"Vaani","AI","Analyst"));
    

     
        System.out.println(employeeTable.size());

   
    
    }
}
