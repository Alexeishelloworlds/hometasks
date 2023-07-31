package by.teachmeskills.c23onl.alexeishchurko.task7;

public enum PhoneModel {

    XIAOMI("Xiaomi"),
    POCO("Poco"),
    SAMSUNG("Samsung"),
    APPLE("iPhone"),
    HUAWEI("Huawei"),
    VIVO("Vivo");

    private String description;

    PhoneModel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
