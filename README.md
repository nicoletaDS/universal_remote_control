### This repository contains exercises from the course
### Master Object Oriented Design (Udemy)

#### Task - open close principle
Model a home entertainment system giving the user the ability to use a single 
remote control to control multiple digital devices such as a devices.TV or sound system.
Keep in mind we only want one controller in our living room! 
It’s a nice universal controller capable of connecting to multiple devices. 
This may call for using the singleton design pattern.

Here is what you need to do: Create a remotes.RemoteControl class with 3 methods in it. 
One for choosing the device to connect the remote control to (make this a static
method), and the other 2 methods are for turning that particular device on or 
off. Create three other classes – devices.Projector, devices.TV, devices.SurroundSoundSystem. All three 
of these devices should follow a consistent interface so that the same remote 
can be used to turn the devices on or off. Remember, you want to implement this 
in such a way that if more devices need to be controlled by the same remote in 
the future, that can be easily done. The last class you can create is the user.Person 
class. This will be the user of the home entertainment system. You can define a 
main method in this class to test out your code. Initialize the devices here and 
have the remote connect to that device to turn it on or off. 