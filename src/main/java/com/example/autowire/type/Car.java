package com.example.autowire.type;

//import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    
    private Specification specification;
    
    public void setSpecification(Specification specification){
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
    }
}
