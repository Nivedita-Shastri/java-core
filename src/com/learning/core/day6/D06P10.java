
package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Objects;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

      
        employeeTable.put(1, new Employee(1, "Sarita", "IT", "Software Engineer"));
        employeeTable.put(2, new Employee(2, "Lalita", "HR", "HR Manager"));
        employeeTable.put(3, new Employee(3, "Vanita", "Finance", "Accountant"));
        employeeTable.put(4, new Employee(4, "Vani", "Marketing", "Marketing Specialist"));

      
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println(isEmpty);
    }
}

