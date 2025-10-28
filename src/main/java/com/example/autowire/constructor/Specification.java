package com.example.autowire.constructor;

//import java.time.LocalDate;

public class Specification {
    private String make;
    private String model;
    //private LocalDate year;

    public Specification(){}

    //LocalDate year
    public Specification(String make, String model) {
        this.make = make;
        this.model = model;
        //this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    /*public LocalDate getYear() {
        return year;
    }*/
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
       this.model = model;
    }

    @Override
    public String toString() {
        // +", year=" + year
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
