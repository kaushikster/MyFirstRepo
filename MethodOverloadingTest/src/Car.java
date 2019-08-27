public class Car extends Vehicle {

    private int wheels;
    private int gears;

    public Car(String name, String type, int wheels, int gears) {
        super(name, type);
        this.wheels = wheels;
        this.gears = gears;
    }

    public void speedCalculation(int speed){
        getSpeed(speed);
    }
}
