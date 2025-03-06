package com.prasad.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
    
    
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee(101, "prasad", 55000));
        employees.add(new Employee(102, "hari", 60000));
        employees.add(new Employee(103, "pavan", 48000));

        
        System.out.println("Employee Details:");
        employees.forEach(Employee::displayDetails);
    }

}
