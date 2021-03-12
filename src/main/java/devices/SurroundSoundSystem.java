package devices;

public class SurroundSoundSystem implements Device{

    public void turnOn() {
        System.out.println("Sound System is On");
    }

    public void turnOff() {
        System.out.println("Sound System is Off");
    }

    @Override
    public String toString() {
        return "sound system";
    }
}
