/**
 * @(#)Account.java
 *
 *
 * @author
 * @version 1.00 2026/3/1
 */

public class Account {

    //instance variables @ global variables @ attributes @ data fields
    int id;
    String AccHolderName;
    double balance;
    double annualInterestRate;

    //default constructor @ no-arguments constructor - assign global with default values
    public Account() {
        id = 0;
        AccHolderName = "";
        balance = 0;
        annualInterestRate = 0;
    }

    //constructor with values - to assign global with specified values
    public Account(int i, String name, double bal, double rate) {
        id = i;
        AccHolderName = name;
        balance = bal;
        annualInterestRate = rate;
    }

    //instance method @ accessor - to get value of id
    public int getId() {
        return id;
    }

    //instance method @ mutator - to set value of id
    public void setId(int p) {
        id = p;
    }

    //instance method @ accessor - to get value of AccHolderName
    public String getAccHolderName() {
        return AccHolderName;
    }

    //instance method @ mutator - to set value of AccHolderName
    public void setAccHolderName(String p) {
        AccHolderName = p;
    }

    //instance method @ accessor - to get value of balance
    public double getBalance() {
        return balance;
    }

    //instance method @ mutator - to set value of balance
    public void setBalance(double p) {
        balance = p;
    }

    //instance method @ accessor - to get value of annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //instance method @ mutator - to set value of annualInterestRate
    public void setAnnualInterestRate(double p) {
        annualInterestRate = p;
    }

    //instance method - to calculate monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    //instance method - to calculate monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    //instance method - to withdraw specified amount from account
    public void Withdraw(double amount) {
        balance = balance - amount;
    }

    //instance method - to deposit specified amount to account
    public void Deposit(double amount) {
        balance = balance + amount;
    }
}