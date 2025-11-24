package ua.opnu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== TimeSpan =====
        System.out.print("Введіть години: ");
        int h = sc.nextInt();
        System.out.print("Введіть хвилини: ");
        int m = sc.nextInt();
        TimeSpan ts = new TimeSpan(h, m);
        System.out.println("Поточний час: " + ts);

        System.out.print("Додати години: ");
        int addH = sc.nextInt();
        System.out.print("Додати хвилини: ");
        int addM = sc.nextInt();
        ts.add(addH, addM);
        System.out.println("Після додавання: " + ts);

        // ===== BankAccount =====
        System.out.print("\nВведіть початковий баланс: ");
        double balance = sc.nextDouble();
        System.out.print("Введіть відсоткову ставку (%): ");
        double rate = sc.nextDouble();

        BankAccount account = new BankAccount(balance, rate);
        System.out.println("Баланс: " + account.getBalance());

        System.out.print("Внесок: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Баланс після внеску: " + account.getBalance());

        System.out.print("Зняття: ");
        double withdraw = sc.nextDouble();
        if(account.withdraw(withdraw))
            System.out.println("Баланс після зняття: " + account.getBalance());
        else
            System.out.println("Недостатньо коштів для зняття.");

        account.addInterest();
        System.out.println("Баланс після нарахування відсотків: " + account.getBalance());
    }
}
