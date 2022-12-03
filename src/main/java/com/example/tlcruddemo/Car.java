package com.example.tlcruddemo;

public class Car {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double millage;

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", millage=" + millage +
                '}';
    }

}

