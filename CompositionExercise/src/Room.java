public class Room {
    
    private Storage myStorage;
    private Light myLight;

    public Room(Storage myStorage, Light myLight) {
        this.myStorage = myStorage;
        this.myLight = myLight;
    }
    
    public void isRoomBright(boolean isBright){
        System.out.println("Room class accessed");
        myLight.powerUp(isBright);
    }
    private int weightCapacity(){
        return myStorage.getWeight();
    }
    public void storageRequired(int number){
        System.out.println("The room can store " +(number * weightCapacity()) + " kgs");
    }
    public Storage getmyStorage() {
        return myStorage;
    }

    public Light getMyLight() {
        return myLight;
    }
}
