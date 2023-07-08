import java.util.Arrays;

public class ArrayComparison {

    //Задача 3: сравнение средних арифметических двух массивов

    public static void main(String[] args) {

        double [] array1 = new double[5];
        double [] array2 = new double[5];
        for(int i = 0; i < 5; i++){
            array1[i] = (int)(Math.random() * 10);
            array2[i] = (int)(Math.random() * 10);
        }
        String displayArray = Arrays.toString(array1);
        System.out.println(displayArray);
        displayArray = Arrays.toString(array2);
        System.out.println(displayArray);
        double sum1 = 0;
        double sum2 = 0;
        for(int i = 0; i <5; i ++) {
            sum1+=array1[i];
            sum2+=array2[i];
        }
        double average1 = sum1/5;
        double average2 = sum2/5;
        System.out.println("Среднее значение первого массива average1 = " + average1);
        System.out.println("Среднее значение второго массива average2 = " + average2);
        if(average1 > average2) {
            System.out.println("average1 > average2");
        } else if (average1 < average2) {
            System.out.println("average1 < average2");
        }else {
            System.out.println("average1 = average2");
        }

    }

}
