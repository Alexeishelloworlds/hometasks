public class MultiplicationTable {

    //Задача: вывести таблицу умножения

    public static void main(String[] args) {
        System.out.print("*   ");
        for (int i = 1; i < 10; i++) System.out.print(i + "   ");//вывод столбцов
        System.out.println();
        for(int i = 1; i < 10 ; i++) {
            //вывод строк с результатами умножения на значение столбца
            System.out.print(i + "   ");
            for (int j = 1; j < 10; j++){
                int m = i * j;
                if (m / 10 == 0)  System.out.print (m + "   ");//if для лучшего вида таблицы, т.е если есть десятки меньше отступ
                else  System.out.print(m + "  ");
            }
            System.out.println();
        }
    }

}


