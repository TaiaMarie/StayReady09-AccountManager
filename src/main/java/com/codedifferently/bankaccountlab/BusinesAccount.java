package com.codedifferently.bankaccountlab;

public class BusinesAccount extends BankAccount
{
    private String companyName;

    public BusinesAccount(Integer pin, Integer accountNumber, double balance, double fees, String companyName) {
        super(pin, accountNumber, balance, fees);
        this.companyName = companyName;
    }
    public String getCompanyName()
    {
        return this.companyName;
    }
    
}