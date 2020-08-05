package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount
{   
    private String name;
   

    public CheckingAccount(Integer pin, Integer accountNumber, double balance, double fees, String name) {
        super(pin, accountNumber, balance, fees);
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
}