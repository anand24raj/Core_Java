package com.adv_java.atm_project;

public class ATM 
{
    void main()
    {
        while (true) 
        {
        	IO.print("\nInsert Card (full class name): ");
            String cardName = IO.readln();

            try 
            {
                // Load class using Reflection
                Class<?> cls = Class.forName(cardName);

                // Create object (Java 21+ / 25 safe way)
                Object obj = cls.getDeclaredConstructor().newInstance();

                IO.println(cardName + " class is loaded and instantiated");

                // Type casting
                ATMCard card = (ATMCard) obj;

                IO.println("Card reading is completed successfully");
                IO.println("Start transactions");

                optionsLoop:
                while (true) 
                {
                	IO.println("\nChoose option: ");
                    IO.println(" 1. Deposit");
                    IO.println(" 2. Withdraw");
                    IO.println(" 3. Balance Enquiry");
                    IO.println(" 4. Exit");
                    IO.print("Enter option number: ");

                    int option;
                    try 
                    {
                        option = Integer.parseInt(IO.readln());
                    }
                    catch (NumberFormatException e) 
                    {
                        IO.println("Error: Enter only numbers");
                        continue;
                    }

                    switch (option) 
                    {
                    case 1 -> 
                    {
                    	while (true) 
                    	{
                    		try 
                    		{
                    			IO.print("\nEnter amount to deposit: ");
                                double amt = Double.parseDouble(IO.readln());
                                card.deposit(amt);
                    		}
                    		catch (NumberFormatException e) 
                    		{
                    			IO.println("Enter numbers only");
                            } 
                    		catch (NegativeAmountException e) 
                    		{
                                IO.println(e.getMessage());
                            }
                    	}
                    }

                    case 2 -> 
                    {
                    	while (true) 
                    	{
                    		try 
                    		{
                    			IO.print("\nEnter amount to withdraw: ");
                                double amt = Double.parseDouble(IO.readln());
                                card.withdraw(amt);
                    		}
                    		catch (NumberFormatException e) 
                    		{
                                IO.println("Enter numbers only");
                            }
                    		catch (NegativeAmountException | InsufficientFundsException e) 
                    		{
                                IO.println(e.getMessage());
                            }
                    	}
                    }

                    case 3 -> card.currentBalance();

                    case 4 -> 
                    {
                    	IO.println("\n******** Thank you :-), Visit Again ********");
                        break optionsLoop;
                    }
                    
                    default -> IO.println("Invalid option");
                    }
                }

            } 
            catch (ClassNotFoundException e) 
            {
                IO.println("Class not found : " + cardName);
            }
            catch (ClassCastException e) 
            {
                IO.println("Invalid ATM card");
            } 
            catch (ReflectiveOperationException e) 
            {
                IO.println("Card initialization failed : "+ e.getMessage());
            }
        }
    }
}