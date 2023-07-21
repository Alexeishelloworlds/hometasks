package by.teachmeskills.c23onl.alexeishchurko.task7;

public class Operator {

    // Это я попытался сымитировать класс оператора связи Operator. Он может генерировать входящие звонки в методе generateIncomingCall
    // и делать рассылку сообщений в методе doMessaging, проверяя существует ли указанный в рассылке номер среди абонентов оператора
    // В конструкторе инициализируется имя оператора и создается список абонентов
    private String operatorName;
    private Phone[] abonents;

    public Operator(Phone... phones) {
        this("A1", phones);
    }

    public Operator(String name, Phone... phones) {
        operatorName = name;
        abonents = new Phone[phones.length];
        for (int i = 0; i < phones.length; i++) {
            abonents[i] = phones[i];
        }
    }

    // метод имитации входящих звонков для вызываемого абонента calledPhone
    public void generateIncomingCall(Phone calledPhone) {
        System.out.println("Добро пожаловать в " + operatorName + "!");
        int randomInNumber = (int) (Math.random() * abonents.length);
        calledPhone.receiveCall("АБОНЕНТ", abonents[randomInNumber].getNumber());
    }

    // метод рассылки сообщений от sender
    public void doMessaging(Phone sender, String... outs) {
        boolean isExist;

        for (int i = 0; i < outs.length; i++) {

            isExist = false;

            for (int j = 0; j < abonents.length; j++) {
                if (outs[i].equals(abonents[j].getNumber())) {
                    isExist = true;
                    break;
                }
            }

            if (isExist) {
                sender.sendMessage(outs[i]);
            } else {
                System.out.println("Сообщение на номер " + outs[i] + " не отправлено. Номер набран неправильно или не существует");
            }

        }
    }
}
