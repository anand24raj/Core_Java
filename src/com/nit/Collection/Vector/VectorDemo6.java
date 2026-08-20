package com.nit.Collection.Vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

record Player(Integer id, String name, Double basePrice) 
{
	
}

class IPLTeam 
{
    private String name;
    private final List<Player> listOfPlayers;

    public IPLTeam(String name) 
    {
        this.setName(name);
        this.listOfPlayers = new Vector<>(); //Composition
    }

    public void addPlayer(Player player) 
    {
        listOfPlayers.add(player);
    }

    public void displayPlayerList() 
    {
        listOfPlayers.forEach(IO::println);
    }

    public void retainOrRemove() 
    {
        Iterator<Player> iterator = listOfPlayers.iterator();

        while (iterator.hasNext()) 
        {
            Player player = iterator.next();
            if (player.basePrice() > 10000) 
            {
                iterator.remove();
            }
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class VectorDemo6 
{
    public static void main(String[] args) 
    {
        IPLTeam team = new IPLTeam("SRH");

        team.addPlayer(new Player(101, "Rahul", 110000D));
        team.addPlayer(new Player(102, "Ravi", 15000D));
        team.addPlayer(new Player(103, "Kiran", 9000D));
        team.addPlayer(new Player(104, "Nitish", 18000D));
        team.addPlayer(new Player(105, "Ishan", 10000D));

        team.displayPlayerList();

        IO.println("Retain OR Remove process started");

        team.retainOrRemove();

        team.displayPlayerList();
    }
}