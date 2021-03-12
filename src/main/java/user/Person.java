package user;

import devices.Projector;
import devices.TV;
import remotes.RemoteControl;

public class Person{

    public static void main(String[] args) {

        // Devices in the home
        Projector projector = new Projector();
        TV tv = new TV();

        // The user's control
        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOnButton();

        remoteControl.connectToDevice(tv);
        remoteControl.clickOnButton();
        remoteControl.clickOffButton();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOffButton();
    }
}
