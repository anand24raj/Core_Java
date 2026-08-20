package com.nit.loose_coupling;

public interface MobilePhone
{
  void insertSim(SimCard sim);
  void makingCall(long mobile);
  void sendSMS(long mobile, String message);
  void removeSim();
}
