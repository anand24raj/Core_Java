package com.nit.interfaces;

public interface Payment 
{
	public abstract void processPayment();
	public abstract void applyDiscount();
}

 class CreditCardPayment implements Payment
{
	@Override
	public void processPayment() 
	{
		IO.println("Processing Credit Card payment...");
		
	}
	@Override
	public void applyDiscount() 
	{
		IO.println("Applying 10% discount for Credit Card payment");
		
	}
}
 
 class UPIPayment implements Payment
 {

	@Override
	public void processPayment() 
	{
		IO.println("Processing UPI payment...");
		
	}

	@Override
	public void applyDiscount() 
	{
		IO.println("Applying 5% discount for UPI payment");
		
	}
	 
 }
 
 class PaymentGateway
 {
	
	 Payment pay = null;
	 Payment initiatePayment(String paymentType)
	 {
		 if(paymentType.equalsIgnoreCase("creditcard"))
		 {
			 IO.println("Initiating Credit Card payment");
			 pay = new CreditCardPayment();
			 pay.processPayment();
			 pay.applyDiscount();
			 
		 }
		 else if(paymentType.equalsIgnoreCase("upi"))
		 {
			 IO.println("Initiating UPI payment");
			 pay = new UPIPayment();
			 pay.processPayment();
			 pay.applyDiscount();
		 }
	
		 else
		 {
			IO.println("Invalid payment type selected!"); 
		 }
		 return pay;
	 }
 }
 
 

 
 
 