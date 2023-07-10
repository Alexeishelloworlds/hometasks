import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

    //Задача 0: про определение присутствия введенного числа в массиве целых чисел

    //Я еще дописал чтобы находило под каким номером в массиве и сколько раз повторяется

    public static void main(String[] args) {

        int [] array = new int[]{1, 3, 2, 5, 4, 17, 25, 100, 3, 3, 10, 0, 10};
        String displayArray = Arrays.toString(array);
        System.out.println(displayArray);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для поиска:");
        int number = input.nextInt();
        int repeat = 0;
        for(int i=0; i < array.length; i++) {
            if(array[i] == number) {
                repeat++;
                System.out.println("array [" + i + "] = " + number);
            }
        }
        if (repeat > 0)System.out.println("Число входит в массив. Повторяется: " + repeat + " раз");
        else System.out.println("Число не входит в массив");

    }
}
