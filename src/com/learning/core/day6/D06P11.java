package com.learning.core.day6;
import java.util.Hashtable;
class Employee5 {
	    private int id;
	    private String name;
	    private String department;
	    private String designation;

	    public Employee5(int id, String name, String department, String designation) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.designation = designation;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + designation + " " + department;
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Employee5 employee = (Employee5) obj;
	        return id == employee.id;
	    }
	}
public class D06P11 {
	    public static void main(String[] args) {
	        Hashtable<Integer, Employee5> employeeHashtable = new Hashtable<>();


	        Employee5 emp1 = new Employee5(1001, "Grace", "Tech Support", "HR");
	        Employee5 emp2 = new Employee5(1002, "Robert", "Product Manager", "Development");
	        Employee5 emp3 = new Employee5(1003, "Thomas", "Tester", "Testing");
	        Employee5 emp4 = new Employee5(1004, "Daniel", "Analyst", "L&D");

	        employeeHashtable.put(emp1.hashCode(), emp1);
	        employeeHashtable.put(emp2.hashCode(), emp2);
	        employeeHashtable.put(emp3.hashCode(), emp3);
	        employeeHashtable.put(emp4.hashCode(), emp4);

	      
	        int searchId = 1003;
	        Employee5 searchedEmployee = employeeHashtable.get(searchId);

	        
	        if (searchedEmployee != null) {
	            System.out.println(searchedEmployee);
	        } else {
	            System.out.println("Employee with id " + searchId + " not found.");
	        }
	    }
	}