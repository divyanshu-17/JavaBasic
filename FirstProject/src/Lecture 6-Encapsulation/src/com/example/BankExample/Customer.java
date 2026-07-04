package com.example.BankExample;

public class Customer {
    public static void main(String[] args) {
        AccountDetails customer= new AccountDetails("559317J","Dibu Singh");
        customer.depositMoney(5555);
        System.out.println(customer.withdrawMoney(6000));
        System.out.println(customer.currBalance());
        customer.depositMoney(-1111);
        customer.withdrawMoney(-5);
    }
}
