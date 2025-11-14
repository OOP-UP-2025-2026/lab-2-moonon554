import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private String name;
    private int year;
    private ArrayList<String> courses = new ArrayList<>();

    Student(String name, int year) {
        if (year < 1 || year > 4) throw new IllegalArgumentException("Year must be 1–4");
        this.name = name;
        this.year = year;
    }

    void addCourse(String c) {
        if (c != null && !c.isEmpty()) courses.add(c);
    }

    void dropAll() {
        courses.clear();
    }

    int getCourseCount() {
        return courses.size();
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    int getTuition() {
        return year * 20000;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ====== Ввод данных о студенте ======
        System.out.print("Введіть ім'я студента: ");
        String name = sc.nextLine();

        System.out.print("Введіть рік навчання (1–4): ");
        int year = sc.nextInt();
        sc.nextLine();

        Student st = new Student(name, year);

        System.out.println("Введіть 3 дисципліни:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Дисципліна " + (i+1) + ": ");
            st.addCourse(sc.nextLine());
        }

        // ====== Вивід ======
        System.out.println(st.getName() + ": кількість дисциплін - " + st.getCourseCount());
        System.out.println(st.getName() + ": рік навчання - " + st.getYear());
        System.out.println(st.getName() + ": заплатив за навчання - " + st.getTuition());
    }
}
