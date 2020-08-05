package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount
{   
    private String name;
    private double interestRate;

    public SavingsAccount(Integer pin, Integer accountNumber, double balance, double fees, String name, double interestRate) {
        super(pin, accountNumber, balance, fees);
        this.name = name;
        this.interestRate = interestRate;
    }
    public String getName()
    {
        return name;
    }
    public double getIterestRate()
    {
        return this.interestRate;
    }
    
}