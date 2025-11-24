package ua.opnu;

public class BankAccount {
    private double balance;
    private double interestRate;

    public BankAccount() {
        this.balance = 0.0;
        this.interestRate = 0.0;
    }

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        if(amount >= 0)
            balance += amount;
    }

    public boolean withdraw(double amount) {
        if(amount >= 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void addInterest() {
        balance += balance * interestRate / 100.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

