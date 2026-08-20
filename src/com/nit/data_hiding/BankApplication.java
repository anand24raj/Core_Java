package com.nit.data_hiding;

import com.nit.blc.Customer;

public class BankApplication {

    void main() {

        Customer raj = new Customer();
        raj.deposit(5000);
        raj.withdraw(2000);

        System.out.println("Available Balance: " + raj.getBalance());
    }
}
