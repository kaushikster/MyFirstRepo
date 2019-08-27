package com.Kaushik;

public class Car {
private String name;
private int cylinders;
private int wheels;
private String model;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getModel() {
        return model;
    }
    public void startEngine(){
        System.out.println("Car class - engine started");
    }
    public void accelerate(){
        System.out.println("Car class - accelerate");
    }
    public void setModel(String model){
        this.model = model;
    }
}
