import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ЛАБОРАТОРНА РОБОТА 2 ===");

        // --- ЧАСТИНА 1: TimeSpan ---
        System.out.println("\n[1] Тестування TimeSpan");
        TimeSpan t1 = TimeSpan.createFromInput(sc);
        
        System.out.println("Створено: " + t1);
        
        System.out.println("Додаємо хвилини...");
        System.out.print("Скільки хвилин додати? ");
        try {
            int mins = Integer.parseInt(sc.nextLine());
            t1.addMinutes(mins);
            System.out.println("Новий час: " + t1);
        } catch (Exception e) {
            System.out.println("Некоректне число.");
        }

        // --- ЧАСТИНА 2: BankAccount ---
        System.out.println("\n[2] Тестування BankAccount");
        BankAccount acc = BankAccount.createFromInput(sc);
        System.out.println(acc);

        System.out.print("Введіть суму для зняття: ");
        try {
            double amount = Double.parseDouble(sc.nextLine());
            acc.withdraw(amount);
        } catch (Exception e) {
            System.out.println("Помилка введення.");
        }

        System.out.println("Фінальний стан: " + acc);
        
        sc.close();
    }
}
