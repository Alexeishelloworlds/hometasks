import java.util.Scanner;

public class SumOfNumbers {

    //Задача: просуммировать все числа от 1 до введенного пользователем числа

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int endNumber = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= endNumber; i++) {
            sum += i;
        }
        System.out.println("Сумма:" + sum);
    }

}
