package com.core_java.oops.loose_coupling;

public interface SimCard
{
   long getMobileNumber();
   String getNetworkProvider();
   void activate();
   void deactivate();
}

