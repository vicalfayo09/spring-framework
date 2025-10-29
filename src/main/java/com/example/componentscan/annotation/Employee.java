package com.example.componentscan.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private int employeeId;
    @Value("John")
    private String firstName;
    @Value("Doe")
    private String lastName;
    @Value("#{4000*20}")
    private double salary;

    //public Employee(){}

    /*public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }*/

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        // +", year=" + year
        return "Employee {" +
                "employeeId='" + employeeId + '\'' +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
    
}
