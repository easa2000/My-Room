public class SwitchBox {
    private int numberOfSwitches;
    private int numberOfPlugs;

    public SwitchBox(int numberOfSwitches, int numberOfPlugs) {
        this.numberOfSwitches = numberOfSwitches;
        this.numberOfPlugs = numberOfPlugs;
    }

    public void turnOnFan() {
        System.out.println("Fan is turned on");
    }

    public void turnOnLight() {
        System.out.println("Light is turned on");
    }

    public void turnOFFFan() {
        System.out.println("Fan is turned off");
    }

    public void turnOffLight() {
        System.out.println("Light is turned off");
    }

    public int getNumberOfSwitches() {
        return numberOfSwitches;
    }

    public int getNumberOfPlugs() {
        return numberOfPlugs;
    }
}
