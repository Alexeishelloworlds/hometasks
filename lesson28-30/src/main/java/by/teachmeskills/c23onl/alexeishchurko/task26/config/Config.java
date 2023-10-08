package by.teachmeskills.c23onl.alexeishchurko.task26.config;

import by.teachmeskills.c23onl.alexeishchurko.task26.domain.Bolid;
import by.teachmeskills.c23onl.alexeishchurko.task26.domain.Command;
import by.teachmeskills.c23onl.alexeishchurko.task26.domain.Driver;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.*;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.impl.BookmakerImpl;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.impl.InputImpl;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.impl.RacingCompetitionImpl;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.impl.WalletImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import java.util.List;

// конфигурация с помощью Java кода
//@Configuration
public class Config {
    // бины Болидов
    @Bean
    public Bolid bolid1() {
        return new Bolid("bolid1");
    }

    @Bean
    public Bolid bolid2() {
        return new Bolid("bolid2");
    }

    @Bean
    public Bolid bolid3() {
        return new Bolid("bolid3");
    }

    // бины Водителей
    @Bean
    public Driver driver1() {
        return new Driver("driver1");
    }

    @Bean
    public Driver driver2() {
        return new Driver("driver2");
    }

    @Bean
    public Driver driver3() {
        return new Driver("driver3");
    }

    // бины Комманд
    @Bean
    public Command command1() {
        return new Command("command1", bolid1(), driver1());
    }

    @Bean
    public Command command2() {
        return new Command("command2", bolid2(), driver2());
    }

    @Bean
    public Command command3() {
        return new Command("command3", bolid3(), driver3());
    }

    // бин Соревнования
    @Bean
    public Competition racing(List<Participant> commands) {
        // добавление участников соревнования(Command extends Participant)
        return new RacingCompetitionImpl(commands);
    }

    // бин Кошелька
    @Bean
    public Wallet wallet() {
        return new WalletImpl(1000);
    }

    @Bean
    @Primary
    public Wallet walletOfBillionaire() {
        return new WalletImpl(1_000_000);
    }

    // бин Ввода
    @Bean
    public Input input() {
        return new InputImpl();
    }

    // бин Букмекера
    @Bean
    public Bookmaker bookmaker(Competition competition, Wallet wallet, Input input) {
        return new BookmakerImpl(competition, wallet, input);
    }
}