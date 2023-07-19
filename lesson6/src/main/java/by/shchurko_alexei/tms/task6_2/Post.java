package by.shchurko_alexei.tms.task6_2;

//Перичисление возможных должностей
public enum Post {

    MANAGER("Руководитель"),
    ACCOUNTANT("Бухгалтер");

    protected String description;

    Post(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
