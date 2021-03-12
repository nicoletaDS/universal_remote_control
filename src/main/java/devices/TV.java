package devices;

public class TV implements Device{

    public void turnOn() {
        System.out.println("TV is On");
    }

    public void turnOff() {
        System.out.println("TV is Off");
    }

    @Override
    public String toString() {
        return "tv";
    }
}
