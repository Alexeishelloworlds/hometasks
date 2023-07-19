package by.shchurko_alexei.tms.task6_2;

//Перичисление специализаций должности бухгалтер
public enum AccountantSpecialization {

    TAX("Расчет налогов и сборов"),
    PAYROLL("Начисление заработной платы");

    protected String description;

    AccountantSpecialization(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
