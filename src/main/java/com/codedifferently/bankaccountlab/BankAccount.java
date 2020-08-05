package com.codedifferently.bankaccountlab;

public abstract class BankAccount 
{   
    private Integer pin;
    private Integer accountNumber;
    private double balance = 0;
    private double fees;

    public BankAccount(Integer pin, Integer accountNumber, double balance, double fees)
    {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.fees = fees;
    }
    public Integer getPin()
    {
        return this.pin;
    }
    public Integer getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double getFees()
    {
        return this.fees;
    }
}

