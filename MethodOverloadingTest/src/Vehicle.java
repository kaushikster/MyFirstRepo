public class Vehicle {
    private String name;
    private String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public int getSpeed(int speed){
        System.out.println("The speed in mi/hr =" +speed);
        return speed;
    }
}
