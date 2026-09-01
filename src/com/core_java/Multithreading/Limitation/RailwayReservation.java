package com.core_java.Multithreading.Limitation;

class Client implements Runnable 
{

    private int availableSeat = 1;
    private int wantedSeat;

    public Client(int wantedSeat) 
    {
        this.wantedSeat = wantedSeat;
    }

    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();

        if (availableSeat >= wantedSeat) 
        {
            IO.println(name + " has booked " + wantedSeat + " berth");
            availableSeat = availableSeat - wantedSeat;
        } 
        else 
        {
            System.err.println("Sorry " + name + " berth/seat is not available");
        }
    }
}

public class RailwayReservation 
{
    public static void main(String[] args) 
    {
        Client client = new Client(1);

        Thread t1 = new Thread(client, "Scott");
        Thread t2 = new Thread(client, "Alen");

        t1.start();
        t2.start();
    }
}