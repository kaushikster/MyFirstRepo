public class Light {
    private String model;
    private int power;
    private int cost;
    private boolean isOn;

    public Light(String model, int power, int cost, boolean isOn) {
        this.model = model;
        this.power = power;
        this.cost = cost;
        this.isOn = isOn;
    }
    public void powerUp(boolean isOn){
        if (isOn) {
            System.out.println("The light is powered on");
        }
        else System.out.println("Power off");
    }
    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getCost() {
        return cost;
    }

    public boolean isOn() {
        return isOn;
    }
}
