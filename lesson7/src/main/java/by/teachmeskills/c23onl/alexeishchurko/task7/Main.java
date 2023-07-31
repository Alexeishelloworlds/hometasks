package by.teachmeskills.c23onl.alexeishchurko.task7;

public class Main {

    // Задача: Создайте класс Phone ...
    public static void main(String[] args) {
        Phone myPhone = new Phone("+375(33)*******", PhoneModel.SAMSUNG, 150);
        Phone somePhone1 = new Phone("+375(44)номер1", PhoneModel.APPLE, 200);
        Phone somePhone2 = new Phone("+375(44)номер2", PhoneModel.XIAOMI, 170);
        Phone somePhone3 = new Phone("+375(44)номер3", PhoneModel.POCO, 170);
        Phone somePhone4 = new Phone("+375(44)номер4", PhoneModel.HUAWEI, 150);
        Phone somePhone5 = new Phone("+375(44)номер5", PhoneModel.VIVO, 150);

        // создание объекта оператора связи с абонентами
        Operator operator = new Operator(somePhone1, somePhone2, somePhone3, somePhone4, somePhone5);

        // имитация входящего вызова для телефона myPhone через оператора operator
        operator.generateIncomingCall(myPhone);

        // рассылка сообщений с телефона myPhone через оператора operator на перечисленные номера
        operator.doMessaging(myPhone, "+375(44)номер1", "+375(44)номер3", "INCORRECT", "NONEXISTEN", "+375(44)номер5");
    }
}
