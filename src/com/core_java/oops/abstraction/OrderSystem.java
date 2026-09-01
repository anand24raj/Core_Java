/*You are designing an order processing system for an e-commerce application.
The system needs an abstract class to define common operations for different types of orders, such as online orders, store pickup, or subscription orders.

The developer tries to declare multiple abstract methods in the class to handle order processing.
Mistakenly, the methods have the same name and parameter list, or differ only by return type.

This demonstrates a compile-time error in Java due to method signature conflict.

Create an abstract class named OrderService.
Inside the class, declare two abstract methods with the same name processOrder:

Case A: Only return type differs.
Case B: Exact same signature (name + parameters).

Observe and note the compile-time error produced by the compiler.
Correct the class by:

Using valid overloading with different parameter lists.
Ensuring abstract methods follow Java method signature rules.

Optionally, create a concrete subclass to implement the abstract methods for testing.
Method Name: processOrder
Parameter(s): int orderId (for the first method)
Parameter(s): optionally (int orderId, String orderType) for valid overloading
Return type: void or int (invalid overloading example)
Examples
Example 1:

Input

Enter order ID: 101
Enter choice:
1
Output

Processing order with ID: 101
Example 2:

Input

Enter order ID: 102
Enter order type: Online
Enter choice:
2
Output

Processing Online order with ID: 102
Explanation

Java identifies a method by its name and parameter list (method signature), not by return type.
Declaring two abstract methods with the same signature or only differing in return type causes a compile-time error.
Valid overloading is possible only by changing the parameter list in abstract methods.
Constraints
Abstract methods cannot have identical names and parameters.
Return type alone cannot differentiate methods.
Overloaded abstract methods must have different parameter lists.
All abstract methods in the class must be implemented in the concrete subclass.
Switch-case or menu-driven programs may pass inputs to the implemented methods.*/

package com.core_java.oops.abstraction;

//ELC Class
public class OrderSystem {
 void main() {
     int orderId = Integer.parseInt(IO.readln()); 
     int choice = Integer.parseInt(IO.readln());  

     switch (choice) {
         case 1 -> 
         { 
             SimpleOrderService simpleOrder = new SimpleOrderService();
             simpleOrder.processOrder(orderId);
         }

         case 2 -> 
         { 
             String orderType = IO.readln();
             OnlineOrderService onlineOrder = new OnlineOrderService();
             onlineOrder.processOrder(orderId, orderType);
         }

         default -> IO.println("Invalid choice.");
     }
 }
}

abstract class OrderService {
 public abstract void processOrder(int orderId);
 public abstract void processOrder(int orderId, String orderType);
}

class SimpleOrderService extends OrderService 
{
 @Override
 public void processOrder(int orderId) {
     IO.println("Processing order with ID: " + orderId);
 }

 @Override
 public void processOrder(int orderId, String orderType) 
 {
 
 }
}

class OnlineOrderService extends OrderService 
{
 
 @Override
 public void processOrder(int orderId) 
 {
 
 }

 @Override
 public void processOrder(int orderId, String orderType) 
 {
     IO.println("Processing " + orderType + " order with ID: " + orderId);
 }
}
