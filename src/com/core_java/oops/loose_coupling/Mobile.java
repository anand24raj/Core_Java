package com.core_java.oops.loose_coupling;

public class Mobile implements MobilePhone
{
    private SimCard sim;
   
    @Override
    public void insertSim(SimCard sim)
    {
        this.sim = sim;        
        IO.println(sim.getNetworkProvider()+" sim inserted successfully!!!");
        sim.activate();
    }

    @Override
    public void makingCall(long mobile)
    {
        IO.println(sim.getNetworkProvider()+" is making a call to "+mobile+" number");
    }

    @Override
    public void sendSMS(long mobile, String message)
    {
        IO.println(sim.getNetworkProvider()+" is sending "+message+" message to "+mobile+" number");
    }

    @Override
    public void removeSim()
    {
        sim.deactivate();

    }

}