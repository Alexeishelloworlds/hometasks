package by.teachmeskills.c23onl.alexeishchurko.task25;

import java.util.ArrayList;
import java.util.List;

public class Bookmaker {
    private String name;
    private List<Command> commands = new ArrayList<>();

    public Bookmaker(String name) {
        this.name = name;
    }

    public void addCommand(Command command/*Command... commands*/) {
//        for(Command command : commands){
//            this.commands.add(command);
//        }
        commands.add(command);
    }

    public void showCommands() {

        for (int i = 0; i < commands.size(); i++) {
            System.out.println(i + 1 + ": " + commands.get(i).getInfo());
        }
    }

    public String chooseCommand(int number) {
        return commands.get(number - 1).getName();
    }

    int checkBet(String betCommand, int betSum, String vinner) {
        if (betCommand.equals(vinner)) {
            return betSum * 2;
        }
        return 0;
    }
}
