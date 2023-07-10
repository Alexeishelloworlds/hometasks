import java.util.Scanner;

public class EvenNumber {

    //Задача про определение четности введенного числа

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        if (input.nextInt() == 0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }
}
