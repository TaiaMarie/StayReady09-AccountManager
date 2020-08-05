package com.codedifferently.bankaccountlab;

import org.junit.Test;
import org.junit.Assert;

public class CheckingAccountTest 
{   @Test
    public void constructorTest()
    {
        //Given
        Integer pin = 0423;
        Integer accountNumber = 190845643;
        double balance = 0;
        double fees = 10.00;
        String name = "Taia";
        
        //When
        CheckingAccount testChecking = new CheckingAccount(pin, accountNumber, balance, fees, name);
        Integer actualPin = testChecking.getPin();
        Integer actualAcctNum = testChecking.getAccountNumber();
        double actualBalance = testChecking.getBalance();
        double actualFees = testChecking.getFees();
        String actualName = testChecking.getName();

        //Then
        Assert.assertEquals(pin, actualPin);
        Assert.assertEquals(accountNumber, actualAcctNum);
        Assert.assertEquals(balance, actualBalance, 0);
        Assert.assertEquals(fees, actualFees, 0);
        Assert.assertEquals(name, actualName);
    }
}