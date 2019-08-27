package com.Kaushik;

public class Toyota extends Car {

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota - start engine");;
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota - accelerate");;
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }
}
