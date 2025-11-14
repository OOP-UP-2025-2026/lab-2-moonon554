class BankAccount {

    public double balance = 0;
    public double transactionFee = 0;

    BankAccount() {}

    boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) return false;

        double total = amount + transactionFee;

        if (balance >= total) {
            balance -= total;
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount other, double amount) {
        if (other == null || amount <= 0) return false;

        double total = amount + transactionFee;

       	if (balance >= total) {
            balance -= total;
            other.balance += amount;
            return true;
        }
        return false;
    }
}
