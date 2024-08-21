/*
 * File: CustomerAccount.java
 * Written by Divya Rasania on 10/02/2023
 */

package ch10.Figures;

public class CustomerAccount {
    private int acctNum;
    private double balance;
    public static double HIGH_CREDIT_LIMIT = 20000.00;

    public CustomerAccount(int num, double bal) throws HighBalanceException {
        acctNum = num;
        balance = bal;
        if (balance > HIGH_CREDIT_LIMIT)
            throw (new HighBalanceException());
    }
}
