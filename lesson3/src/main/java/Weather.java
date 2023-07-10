import java.util.Scanner;

public class Weather {

    //Задача про определение комфорта по температуре на улице

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру на улице:");
        int temperature = input.nextInt();
        if (temperature > -5)
        {

            if(temperature > 40) System.out.println("Пекло");
            else System.out.println("Тепло");
        }
        else if (temperature < -5 && temperature > -20 ) System.out.println("Нормально");
        else if (temperature < -20) System.out.println("Холодно");
    }
}
