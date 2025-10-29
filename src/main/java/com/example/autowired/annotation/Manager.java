package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
//can do field Autowiring , constructor Autowiring(best practice) and setter Autowiring
public class Manager {
    //@Autowired
    //@Qualifier("employee1")
    
    private Employee employee;

    @Autowired
    public Manager(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee(){
        return employee;
    }

    @Override
    public String toString() {
    
        return "Manager{"+ "employee=" + employee + '}';
    }
}
