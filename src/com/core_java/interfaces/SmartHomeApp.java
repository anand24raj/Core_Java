/*In a smart home automation system, different smart devices such as speakers, lights, and fans can be controlled remotely.
All smart devices must follow a common set of controls defined by an interface. However, some basic behavior is common to all devices, while certain actions depend on the specific device type.

To achieve this, Java allows an abstract class to partially implement an interface, leaving the remaining functionality to its subclasses.

Question
Create an interface named Controllable with two methods:
turnOn()
turnOff()

Create an abstract class SmartDevice that implements the Controllable interface.
Implement only the turnOn() method.
Do not implement turnOff().

Create a concrete subclass SmartSpeaker that extends SmartDevice.
Implement the remaining turnOff() method.

Create a test class with a menu-driven (switch-case) program that allows the user to:
Press 1 to turn ON the smart speaker
Press 2 to turn OFF the smart speaker
Display an appropriate message for invalid input*/

package com.core_java.interfaces;

interface Controllable
{
    void turnOn();
    void turnOff();
}

abstract class SmartDevice implements Controllable
{
    public void turnOn()
    {
        IO.println("Smart device is turned ON.");
    }
}

class SmartSpeaker extends SmartDevice
{
    public void turnOff()
    {
        IO.println("Smart speaker is turned OFF.");
    }
}

public class SmartHomeApp
{
    public static void main(String[] args)
    {
        SmartSpeaker speaker = new SmartSpeaker();

        int choice = Integer.parseInt(IO.readln());

        switch(choice)
        {
            case 1 -> speaker.turnOn();
            case 2 -> speaker.turnOff();
            default -> IO.println("Invalid choice!");
        }
    }
}


