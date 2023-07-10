import java.util.Arrays;
import java.util.Scanner;

public class MaxMinAverage {

    //Задача 2: Поиск максимального, минимального элементов массива, вычисление среднего значения

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = input.nextInt();
        double [] array = new double[length];
        for(int i = 0; i < length; i++)
            array[i] = (int)(Math.random() * 10);
        String displayArray = Arrays.toString(array);
        System.out.println(displayArray);
        double min = array[0];
        double max = array[0];
        double sum = array[0];
        for(int i=1; i < array.length; i++){
            sum+=array[i];
            if(min > array[i]) min = array[i];
            if(max < array[i]) max = array[i];
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
        System.out.println("Среднее значение = " + sum/length);

    }

}
