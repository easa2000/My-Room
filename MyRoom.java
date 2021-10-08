public class MyRoom {
    private int length;
    private int breadth;
    private int door;
    private int window;
    private Bed bed;
    private Cupboard cupboard;
    private SwitchBox switchBox;

    public MyRoom(int length, int breadth, int door, int window, Bed bed, Cupboard cupboard, SwitchBox switchBox) {
        this.length = length;
        this.breadth = breadth;
        this.door = door;
        this.window = window;
        this.bed = bed;
        this.cupboard = cupboard;
        this.switchBox = switchBox;
    }

    private int getLength() {
        return length;
    }

    private int getBreadth() {
        return breadth;
    }

    private int getDoor() {
        return door;
    }

    private int getWindow() {
        return window;
    }

    public void takeRest() {
        switchBox.turnOnFan();
        switchBox.turnOffLight();
        bed.takeRest();
    }


}
