/*Banking Transaction with Multiple Catch
 
You are developing a banking transaction system that allows a user to withdraw money from an account.
Since user input and system state may vary, the program must handle multiple types of runtime exceptions using multiple catch blocks.
The system should handle the following scenarios:

If the withdrawal amount is greater than the available balance, an ArithmeticException should be caught.
If the user enters an invalid data type (for example, characters instead of numbers), an InputMismatchException should be caught.
If the bank account object is not available or not found, a NullPointerException should be caught.
This problem demonstrates how Java handles business rule violations and system-related errors using multiple catch blocks.

Input Format
-------------------
First line: Account balance (integer)
Second line: Withdrawal amount (integer)

Output Format
----------------------
If the transaction is valid, print the remaining balance.
If an error occurs, print the corresponding error message.  */

package com.nit.exception.custom_exception;

import java.util.*;

public class BankingTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer balance = sc.nextInt();
            int withdraw = sc.nextInt();

            if (withdraw > balance) {
                throw new ArithmeticException();
            }

            balance = balance - withdraw;
            IO.println("Remaining balance: " + balance);
        }
        catch (InputMismatchException e) {
            IO.println("Invalid input type");
        }
        catch (ArithmeticException e) {
            IO.println("Insufficient funds");
        }
        catch (NullPointerException e) {
            IO.println("Account not found");
        }
        finally {
            sc.close();
        }
    }
}