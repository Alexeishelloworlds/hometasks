package by.shchurko_alexei.tms.task6_2;

//Перичисление возможных отделов
public enum Department {
    GENERAL("Главный директор"),
    DESIGN("Проектирование"),
    DEVELOPMENT("Разработка"),
    TESTING("Тестирование"),
    SALES("Продажи"),
    ACCOUNTANTING("Бухгалтерия"),
    TRADE_UNION("Профсоюз");

    protected String description;

    Department(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
