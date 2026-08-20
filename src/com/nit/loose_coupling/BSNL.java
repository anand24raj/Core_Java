package com.nit.loose_coupling;

public class BSNL implements SimCard
{
   private long mobileNumber;
   private String serviceProvider;
   
   
    public BSNL(long mobileNumber, String serviceProvider)
    {
    super();
    this.mobileNumber = mobileNumber;
    this.serviceProvider = serviceProvider;
   }

    @Override
    public long getMobileNumber()
    {
        return this.mobileNumber;
    }

    @Override
    public String getNetworkProvider()
    {
        return this.serviceProvider;
    }

    @Override
    public void activate()
    {
        IO.println(serviceProvider +" sim is activated");

    }

    @Override
    public void deactivate()
    {
        IO.println(serviceProvider +" sim is de-activated");

    }

}


