public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(25,5,2,4);
        Cupboard cupboard = new Cupboard(10,20,4,true);
        SwitchBox switchBox = new SwitchBox(6,1);
        MyRoom myRoom = new MyRoom(500,280,1,1, bed,cupboard,switchBox);
        myRoom.takeRest();
    }
}
