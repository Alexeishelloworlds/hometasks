import java.util.Scanner;

public class SwitchSeason {

    //Задача про вывод поры года по номеру месяца c помощью оператора switch-case
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12:");
        switch (input.nextInt()) {
            //Такой вывод мне IDEA подсказала и предложила в Warnings заменить. Вроде более компактно выглядит
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Неправильно введен номер месяца");
        }
    }
}
