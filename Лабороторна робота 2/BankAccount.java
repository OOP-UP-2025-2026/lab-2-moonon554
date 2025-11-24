package ua.opnu;

public class BankAccount {
    public double balance;
    public double transactionFee;

    public BankAccount() {
        this.balance = 0;
        this.transactionFee = 0;
    }

    public BankAccount(double balance, double transactionFee) {
        this.balance = balance;
        this.transactionFee = transactionFee;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double total = amount + transactionFee;
        if (total > balance) return false;
        balance -= total;
        return true;
    }

    public boolean transfer(BankAccount other, double amount) {
        if (amount <= 0) return false;
        if (!withdraw(amount)) return false;
        other.deposit(amount);
        return true;
    }
}

