package by.teachmeskills.c23onl.alexeishchurko.task7;

public class Phone {

    //Класс Phone с тремя конструкторами, двумя перегруженными методами receiveCall и с методом sendMessage
    private String number;
    private PhoneModel model;
    private int weight;

    public Phone() {
        this("101", PhoneModel.XIAOMI, 150);
    }

    public Phone(String number, PhoneModel model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, PhoneModel model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Вам звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Вам звонит " + callerName + ", номер телефона " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Cообщение на номер " + number + " отправлено");
        }
    }
}
