package com.nit.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

record Player(Integer id, String name, Double baseprice) {}

public class ArrayListDemo3 
{
    public static void main(String args[]) 
    {
        // Fetch player names in uppercase
        List<String> playerName = getPlayerList()
                .stream()
                .map(player -> player.name().toUpperCase())
                .toList();

        playerName.forEach(IO::println);
    }

    public static List<Player> getPlayerList() 
    {
        List<Player> listOfPlayers = new ArrayList<>();

        listOfPlayers.add(new Player(101, "Abhi", 4356D));
        listOfPlayers.add(new Player(102, "Rohit", 4000D));
        listOfPlayers.add(new Player(103, "Virat", 4456D));
        listOfPlayers.add(new Player(104, "Bumrah", 3956D));
        listOfPlayers.add(new Player(105, "Kuldeep", 4156D));

        return listOfPlayers;
    }
}