class Car{
    private int cylinder;
    private int wheels = 4;
    private String name;
    public int startTime;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void accelerate(){
        System.out.println("This is a default acceleration");
    }
    public void startEngine(){
        System.out.println("Start time unknown" );
    }
}
class Corolla extends Car{
    public Corolla() {
        super(4,"Corolla");
    }

    @Override
    public void accelerate() {
        System.out.println("The acceleration is 0-60 mi/h in 5 seconds");
    }

    @Override
    public void startEngine() {
        this.startTime = 5;
        System.out.println("The car starts in " + this.startTime + " seconds");
    }
}

public class Main {

    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        System.out.println(corolla.getName());
    }
}
