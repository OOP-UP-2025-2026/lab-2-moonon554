import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На рахунок зараховано: " + amount);
        } else {
            System.out.println("Некоректна сума для депозиту.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято з рахунку: " + amount);
        } else {
            System.out.println("Недостатньо коштів або некоректна сума.");
        }
    }

    @Override
    public String toString() {
        return "Рахунок: " + accountNumber + ", Власник: " + owner + ", Баланс: " + balance;
    }

    // Метод для створення BankAccount через введення користувача
    public static BankAccount createFromInput(Scanner sc) {
        System.out.print("Введіть номер рахунку: ");
        String number = sc.nextLine();
        System.out.print("Введіть ім'я власника: ");
        String owner = sc.nextLine();
        System.out.print("Введіть початковий баланс: ");
        double balance = Double.parseDouble(sc.nextLine());
        return new BankAccount(number, owner, balance);
    }
}
