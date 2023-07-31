package by.teachmeskills.c23onl.alexeishchurko.task8.enums;

public enum Department {

    GENERAL("Главный директор", 10),
    DESIGN("Проектирование", 1),
    DEVELOPMENT("Разработка", 1),
    TESTING("Тестирование", 1),
    SALES("Продажи", 1),
    ACCOUNTANTING("Бухгалтерия", 1),
    TRADE_UNION("Профсоюз", 1);

    private String description;
    private int departmentCoefficient;

    Department(String description, int departmentCoefficient) {
        this.description = description;
        this.departmentCoefficient = departmentCoefficient;
    }

    public String getDescription() {
        return description;
    }

    public int getDepartmentCoefficient() {
        return departmentCoefficient;
    }
}
