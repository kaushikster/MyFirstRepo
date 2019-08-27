public class Main {
    public static void main(String[] args) {
        Storage theStorage = new Storage("Wood",10,5,20);
        Light theLight = new Light("Phillips",220,5,true);
        Room myRoom = new Room(theStorage,theLight);

        myRoom.isRoomBright(theLight.isOn());
        myRoom.storageRequired(5);
    }
}
