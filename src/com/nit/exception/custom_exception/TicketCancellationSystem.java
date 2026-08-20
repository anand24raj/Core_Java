/*Assignment Deadline Missed
Simulate a scenario where a student submits an assignment after the due date. 
If the submission date is past the deadline,
a custom exception AssignmentDeadlineMissedException should be thrown.


A student attempts to submit an assignment.
If the submission date is later than the assignment due date, the submission fails.

Input:
Assignment due date = 01-01-2025
Submission date = 02-01-2025
Expected Output:
AssignmentDeadlineMissedException: Assignment submission past due date

Hints:
Create a custom exception called AssignmentDeadlineMissedException.
Compare submission date with the assignment due date.
Throw the exception if the submission is late.
Ensure the exception message clearly indicates the missed deadline.*/

package com.nit.exception.custom_exception;

import java.util.HashSet;
import java.util.Set;

class TicketAlreadyCancelledException extends Exception 
{
    private static final long serialVersionUID = 1L;

    public TicketAlreadyCancelledException(int ticketId) 
    {
        super("TicketAlreadyCancelledException: Ticket " + ticketId + " already cancelled");
    }
}

class TicketService 
{
    private static Set<Integer> cancelledTickets = new HashSet<>();

    // Static block to preload cancelled ticket 101
    static 
    {
        cancelledTickets.add(101);
    }

    public static void cancelTicket(int ticketId) throws TicketAlreadyCancelledException 
    {
        if (cancelledTickets.contains(ticketId)) 
        {
            throw new TicketAlreadyCancelledException(ticketId);
        }

        cancelledTickets.add(ticketId);
        System.out.println("Ticket cancelled successfully");
    }
}

public class TicketCancellationSystem 
{
    public static void main(String[] args) 
    {
        int ticketId = Integer.parseInt(IO.readln("Enter Id : "));
        
        try 
        {
            TicketService.cancelTicket(ticketId);
        } 
        catch (TicketAlreadyCancelledException exception) 
        {
            System.out.println(exception.getMessage());
        }
    }
}