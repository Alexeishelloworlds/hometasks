import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

    //Задача 1: удаление заданного числа из массива и создание нового массива без этого числа

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 3, 3, 3, 3};
        String displayArray = Arrays.toString(array);
        System.out.println(displayArray);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число, которое нужно удалить:");
        int number = input.nextInt();
        int repeat = 0;
        for (int i = 0; i < array.length; i++)
            if(array[i] == number)repeat++;
        if(repeat > 0){
            int[] newArray = new int[array.length - repeat];
            int j = 0;
            for (int i = 0; i < array.length; i++)
                if(array[i] != number) {
                    newArray[j] = array[i];
                    j++;
                }
            System.out.println("Массив без числа:");
            displayArray = Arrays.toString(newArray);
            System.out.println(displayArray);
        }else {
            System.out.println("Такого числа нет в массиве");
        }
    }

}
