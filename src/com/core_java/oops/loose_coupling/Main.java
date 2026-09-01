/*Question: Mobile Phone SIM Card Interaction
_______________________________________________

You are tasked with implementing a simulation of a mobile phone interacting with different SIM cards. The goal is to create a system where mobile phones can insert, remove, and use SIM cards from different providers.

Components:
--------------

-> SIMCardInterface: An interface that defines methods for getting phone number, network provider, and activation/deactivation of a SIM card.

-> Jio, Airtel, and BSNL Classes: These classes should implement the SIMCardInterface. Each class represents a SIM card from a different network provider (Jio, Airtel, and BSNL) and should have provider-specific details.

-> MobilePhoneInterface: An interface that defines methods for inserting, removing SIM cards, making calls, and sending text messages.

-> MobilePhone Class: This class should implement the MobilePhoneInterface. It should have a slot for inserting a SIM card and methods for making calls and sending texts.

Tasks:
----------

-> Implement the SIMCardInterface and the classes Jio, Airtel, and BSNL that implement this interface. Include methods for getting phone number, network provider, and activating/deactivating the SIM card.

-> Implement the MobilePhoneInterface and the MobilePhone class that implements this interface. The MobilePhone class should allow inserting and removing SIM cards, making calls, and sending texts.

-> Demonstrate the interaction between mobile phones and different SIM cards:

->Create instances of Jio, Airtel, and BSNL SIM cards.
->Create a MobilePhone instance.
->Insert a SIM card into the mobile phone.
->Make a call and send a text message using the inserted SIM card.
->Remove the SIM card from the mobile phone.
->Discuss how the use of interfaces (SIMCardInterface and MobilePhoneInterface) promotes a loosely coupled architecture and allows flexibility in swapping different SIM cards.

[Note: You can provide the classes with appropriate constructors and methods as needed for the implementation.]

Hints:
--------------
Define the interfaces with the required methods and let the classes implement them.
Consider including print statements to indicate the activation, deactivation, insertion, and removal of SIM cards.
Focus on encapsulation, polymorphism, and the benefits of using interfaces in promoting modular and flexible code.
Feel free to adjust the details and wording of the question according to your preferences and the level of understanding you want to assess.
====================================================================
*/

package com.core_java.oops.loose_coupling;

public class Main {

    public static void main(String[] args)
    {
        BSNL bsnl = new BSNL(9812345678L, "BSNL");
       
        Mobile mobile = new Mobile();
        mobile.insertSim(bsnl);
        mobile.makingCall(9976124587L);
        mobile.sendSMS(9945612345L, "Happy Birthday to Java");
        mobile.removeSim();

    }

}