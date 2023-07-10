import java.util.Scanner;

public class SeasonIf {

    //Задача про вывод поры года по номеру месяца c помощью оператора if-else-if

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12:");
        int month = input.nextInt();
        if (month <= 0 || month > 12) System.out.println("Неправильно введен номер месяца");
        else if (month == 12 || month == 1 || month == 2) System.out.println("Зима");
        else if (month == 3 || month == 4 || month == 5) System.out.println("Весна");
        else if (month == 6 || month == 7 || month == 8) System.out.println("Лето");
        else if (month == 9 || month == 10 || month == 11) System.out.println("Осень");
    }
}
