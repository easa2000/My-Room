public class Cupboard {
    private int length;
    private int height;
    private int selves;
    private boolean isLock;

    public Cupboard(int length, int height, int selves, boolean isLock) {
        this.length = length;
        this.height = height;
        this.selves = selves;
        this.isLock = isLock;
    }

    public void storeIn(String thing, Boolean isLock) {
        if(!isLock) {
            System.out.println(thing + " was kept in");
        } else {
            System.out.println("Cupboard is lock");
        }
    }


    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getSelves() {
        return selves;
    }

    public boolean isLock() {
        return isLock;
    }
}
