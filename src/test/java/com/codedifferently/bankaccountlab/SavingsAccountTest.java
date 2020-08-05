package com.codedifferently.bankaccountlab;
import org.junit.Test;
import org.junit.Assert;

public class SavingsAccountTest
{
      @Test
    public void constructorTest()
    {
        //Given
        Integer pin = 0423;
        Integer accountNumber = 190845643;
        double balance = 0;
        double fees = 10.00;
        String name = "Taia's Vaction";
        double interestRate = 10;
        //When
        SavingsAccount testSavings = new SavingsAccount(pin, accountNumber, balance, fees, name, interestRate);
        Integer actualPin = testSavings.getPin();
        Integer actualAcctNum = testSavings.getAccountNumber();
        double actualBalance = testSavings.getBalance();
        double actualFees = testSavings.getFees();
        String actualName = testSavings.getName();
        double actualInterestRate = testSavings.getIterestRate();

        //Then
        Assert.assertEquals(pin, actualPin);
        Assert.assertEquals(accountNumber, actualAcctNum);
        Assert.assertEquals(balance, actualBalance, 0);
        Assert.assertEquals(fees, actualFees, 0);
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(interestRate, actualInterestRate, 0);
    }
}
