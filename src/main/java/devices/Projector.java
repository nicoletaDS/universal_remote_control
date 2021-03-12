package devices;

public class Projector implements Device{

    public void turnOn() {
        System.out.println("Projector is On");
    }

    public void turnOff() {
        System.out.println("Projector is Off");
    }

    @Override
    public String toString() {
        return "projector";
    }

}
