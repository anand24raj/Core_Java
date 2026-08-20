/*Army Mission Clearance – Custom Exception with Functional Interfaces Question Level

You are required to simulate an Army Mission Clearance System that determines whether a soldier is eligible to participate in a classified mission.
The system must validate eligibility using:
A custom exception
A custom functional interfac
A predefined functional interface
Try-with-resources for mission resource handling
Program Design Requirements :

1. Class Design
Create a custom exception class named MissionDeniedException.
Create a resource-handling class MissionControl that implements AutoCloseable.
Create a custom functional interface for rank validation.
Use a predefined functional interface (Predicate) for experience validation.

2. Instance Variables
int rank
Represents the soldier’s rank.
int experienceYears
Represents years of battlefield experience.

3. Functional Interface Logic
Custom Functional Interface
RankValidator
Validates whether the soldier’s rank meets the mission requirement.
Predefined Functional Interface
Predicate<Integer>
Validates whether experience is sufficient.

4. Mission Rules
Minimum rank required = 5
Minimum experience required = 3 years
If any rule fails, throw MissionDeniedException
If all validations pass, print "Mission approved"

5. Exception Handling Logic
If rank is insufficient → mission denied
If experience is insufficient → mission denied
Always close mission resources using try-with-resources
This design demonstrates advanced Java concepts combined in a real-world defense scenario.

Input Format
--------------------
First line: Integer rank
Second line: Integer years of experience

Output Format
------------------------
If soldier is eligible:
Mission approved
Mission resources released
If soldier is not eligible:
Mission denied due to insufficient clearance
Mission resources released  */

package com.nit.exception.custom_exception;

import java.util.Scanner;
import java.util.function.Predicate;

class MissionDeniedException extends Exception 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MissionDeniedException(String message) 
    {
        super(message);
    }
}

class MissionControl implements AutoCloseable
{
    public void initiateMission() 
    {
        IO.println("Mission initiated...");
    }

    @Override
    public void close() 
    {
        IO.println("Mission resources released");
    }
}

@FunctionalInterface
interface RankValidator 
{
    boolean validate(int rank);
}

public class ArmyMissionClearance 
{
    int rank;
    int experienceYears;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try (MissionControl mc = new MissionControl()) 
        {
            ArmyMissionClearance soldier = new ArmyMissionClearance();

            soldier.rank = sc.nextInt();
            soldier.experienceYears = sc.nextInt();

            RankValidator rankCheck = r -> r >= 5;

            Predicate<Integer> expCheck = exp -> exp >= 3;

            if (!rankCheck.validate(soldier.rank) || !expCheck.test(soldier.experienceYears)) 
            {
                throw new MissionDeniedException("Mission denied due to insufficient clearance");
            }
            IO.println("Mission approved");

        } 
        catch (MissionDeniedException e) 
        {
            IO.println(e.getMessage());
        } 
        catch (Exception e) 
        {
            IO.println("Invalid input type");
        } 
        finally 
        {
            sc.close();
        }
    }
}