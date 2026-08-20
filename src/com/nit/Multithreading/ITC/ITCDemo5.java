package com.nit.Multithreading.ITC;

class TicketSystem 
{
    private int availableTickets = 5; // 5
    public synchronized void bookTicket(int numberOfTickets) // numberOfTickets = 4
    {
        while (numberOfTickets > availableTickets) 
        {
            IO.println("Not enough ticket, Waiting for cancellation");
            try 
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        this.availableTickets = this.availableTickets - numberOfTickets;

        IO.println(numberOfTickets + " tickets are booked, Available tickets are: "
                + this.availableTickets);
    }

    public synchronized void cancelTicket(int numberOfTickets) 
    {
        this.availableTickets += numberOfTickets;

        IO.println(numberOfTickets + " tickets are cancelled, Available tickets are: "
                + this.availableTickets);

        notify();
    }
}

public class ITCDemo5 
{
    public static void main(String[] args) 
    {
        TicketSystem ticketSystem = new TicketSystem(); // lock is created

        Thread bookingThread = new Thread() 
        {
            @Override
            public void run() 
            {
                int[] tickets = {2, 4, 4}; // last iteration

                for (int ticket : tickets) 
                {
                    ticketSystem.bookTicket(ticket);

                    try 
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
        };

        bookingThread.start();

        Thread cancellationThread = new Thread() 
        {
            @Override
            public void run()
            {
                int[] tickets = {1, 3, 2}; // last iteration

                for (int ticket : tickets) 
                {
                    ticketSystem.cancelTicket(ticket);

                    try 
                    {
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
        };

        cancellationThread.start();
    }
}