import java.util.Scanner;

public class SwitchSeason {

    //Задача про вывод поры года по номеру месяца c помощью оператора switch-case
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12:");
        switch (input.nextInt()) {
            //Такой вывод мне IDEA подсказала и предложила в Warnings заменить. Вроде более компактно выглядит
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неправильно введен номер месяца");
        }
    }
}
