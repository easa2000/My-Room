public class Bed {
    private int length;
    private int breadth;
    private int pillow;
    private int bedsheetInMeter;

    public Bed(int length, int breadth, int pillow, int bedsheetInMeter) {
        this.length = length;
        this.breadth = breadth;
        this.pillow = pillow;
        this.bedsheetInMeter = bedsheetInMeter;
    }

    public void takeRest() {
        System.out.println("taking rest");
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getPillow() {
        return pillow;
    }

    public int getBedsheetInMeter() {
        return bedsheetInMeter;
    }
}
