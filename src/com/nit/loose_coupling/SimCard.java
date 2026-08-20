package com.nit.loose_coupling;

public interface SimCard
{
   long getMobileNumber();
   String getNetworkProvider();
   void activate();
   void deactivate();
}

