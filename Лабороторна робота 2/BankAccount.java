import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        if (balance < 0) {
            System.out.println("Помилка: Баланс не може бути від'ємним. Встановлено 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Успішно зараховано: " + amount);
        } else {
            System.out.println("Помилка: Сума депозиту має бути додатною.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Помилка: Сума зняття має бути додатною.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Успішно знято: " + amount);
        } else {
            System.out.println("Помилка: Недостатньо коштів.");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Рахунок #" + accountNumber + " (" + owner + "): " + balance + " грн";
    }

    public static BankAccount createFromInput(Scanner sc) {
        System.out.println("\n--> Створення банківського рахунку:");
        System.out.print("   Номер рахунку: ");
        String number = sc.nextLine();
        System.out.print("   Ім'я власника: ");
        String owner = sc.nextLine();
        
        double balance = 0;
        while(true) {
            System.out.print("   Початковий баланс: ");
            try {
                balance = Double.parseDouble(sc.nextLine());
                if (balance < 0) System.out.println("Баланс не може бути менше 0.");
                else break;
            } catch (NumberFormatException e) {
                System.out.println("Введіть коректне число (наприклад, 100.50)");
            }
        }
        return new BankAccount(number, owner, balance);
    }
}
