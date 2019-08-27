public class Storage {
    private String material;
    private int length;
    private int width;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Storage(String material, int length, int width, int weight) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void weightCapacity(int weight){
        this.weight = weight;
        System.out.println("The table can hold " + getWeight() + " kgs");
    }
    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
