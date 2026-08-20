/*Abstract Class Can Be Declared Without Abstract Methods

To prevent direct object creation, you want a class DatabaseConnection to be abstract even
though it contains only concrete methods.

Question:
Create an abstract class DatabaseConnection with a concrete method connect(). Try to 
instantiate it and explain why making it abstract still prevents instantiation even without
abstract methods.
*/

package com.nit.abstraction;

abstract class DatabaseConnection
{
    public void connect()
    {
        IO.println("Connected to MySQL Database.");
    }
}

class MySQLConnection extends DatabaseConnection
{
    
}

public class Database
{
    public static void main(String[] args)
    {
        DatabaseConnection db = new MySQLConnection();
        db.connect();
    }
}

