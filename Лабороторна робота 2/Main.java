package ua.opnu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BankAccount
        System.out.print("Номер рахунку: ");
        String accNum = sc.nextLine();
        System.out.print("Власник рахунку: ");
        String owner = sc.nextLine();
        System.out.print("Баланс: ");
        double balance = Double.parseDouble(sc.nextLine());
        BankAccount account = new BankAccount(accNum, owner, balance);

        System.out.print("Сума депозиту: ");
        double deposit = Double.parseDouble(sc.nextLine());
        account.deposit(deposit);

        System.out.print("Сума зняття: ");
        double withdraw = Double.parseDouble(sc.nextLine());
        boolean success = account.withdraw(withdraw);
        System.out.println("Операція зняття: " + success);
        System.out.println("Баланс: " + account.getBalance());

        // TimeSpan
        System.out.print("Години: ");
        int h = Integer.parseInt(sc.nextLine());
        System.out.print("Хвилини: ");
        int m = Integer.parseInt(sc.nextLine());
        TimeSpan ts1 = new TimeSpan(h, m);

        System.out.print("Додаткові години: ");
        int h2 = Integer.parseInt(sc.nextLine());
        System.out.print("Додаткові хвилини: ");
        int m2 = Integer.parseInt(sc.nextLine());
        TimeSpan ts2 = new TimeSpan(h2, m2);

        ts1.add(ts2);
        System.out.println("Сумарний час: " + ts1);
    }
}
