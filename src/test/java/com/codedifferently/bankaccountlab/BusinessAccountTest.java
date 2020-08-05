package com.codedifferently.bankaccountlab;

import org.junit.Test;
import org.junit.Assert;

public class BusinessAccountTest 
{   @Test
    public void constructorTest()
    {
        //Given
        Integer pin = 5876;
        Integer accountNumber = 19084493;
        double balance = 0;
        double fees = 2100;
        String companyName = "Nike";
        
        //When
        BusinesAccount testBusiness = new BusinesAccount(pin, accountNumber, balance, fees, companyName);
        Integer actualPin = testBusiness.getPin();
        Integer actualAcctNum = testBusiness.getAccountNumber();
        double actualBalance = testBusiness.getBalance();
        double actualFees = testBusiness.getFees();
        String actualCompanyName = testBusiness.getCompanyName();

        //Then
        Assert.assertEquals(pin, actualPin);
        Assert.assertEquals(accountNumber, actualAcctNum);
        Assert.assertEquals(balance, actualBalance, 0);
        Assert.assertEquals(fees, actualFees, 0);
        Assert.assertEquals(companyName, actualCompanyName);
    }
}