package by.teachmeskills.c23onl.alexeishchurko.task25;

public class Command {

    private String name;
    private Bolid bolid;
    private Driver driver;

    public Command(String name, Bolid bolid, Driver driver) {
        this.name = name;
        this.bolid = bolid;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return "Command: " + name + " Driver: " + driver.getName() + " Bolid: " + bolid.getName();
    }
}
