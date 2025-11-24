import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== BankAccount =====
        System.out.println("=== Створення банківського рахунку ===");
        BankAccount account = BankAccount.createFromInput(sc);
        System.out.println(account);

        System.out.print("Введіть суму для депозиту: ");
        double depositAmount = Double.parseDouble(sc.nextLine());
        account.deposit(depositAmount);

        System.out.print("Введіть суму для зняття: ");
        double withdrawAmount = Double.parseDouble(sc.nextLine());
        account.withdraw(withdrawAmount);

        System.out.println("Поточний стан рахунку:");
        System.out.println(account);

        // ===== TimeSpan =====
        System.out.println("\n=== Робота з TimeSpan ===");
        TimeSpan ts1 = TimeSpan.createFromInput(sc);
        TimeSpan ts2 = TimeSpan.createFromInput(sc);

        ts1.addTimeSpan(ts2);
        System.out.println("Сума часових проміжків: " + ts1);

        sc.close();
    }
}
