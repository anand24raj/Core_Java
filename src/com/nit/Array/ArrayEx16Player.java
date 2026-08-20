package com.nit.Array;

// WAP to hold 5 Player objects in an array
// Search the player based on id (Linear Search)

record Player(Integer id, String name, Double basePrice) 
{
	
}

public class ArrayEx16Player 
{
    public static void main(String[] args) 
    {
        Player[] players = new Player[5];

        players[0] = new Player(45, "Rohit", 2500D);
        players[1] = new Player(18, "Virat", 3500D);
        players[2] = new Player(7, "Dhoni", 5500D);
        players[3] = new Player(12, "Yuvraj", 5500D);
        players[4] = new Player(33, "Shreyas", 4500D);

        int id = Integer.parseInt(IO.readln("Search the player object based on id.\nEnter the player id : "));

        boolean isFound = false;

        for (Player player : players) 
        {
            if (player.id() == id) 
            {
                IO.println("Player Found : " + player);
                isFound = true;
                break;
            }
        }

        if (!isFound) 
        {
        	System.err.println("No such player is available for the given id");
        }
    }
}