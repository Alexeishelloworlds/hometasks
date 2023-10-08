package by.teachmeskills.c23onl.alexeishchurko.task26.service;

import java.util.List;

// интерфейс Соревнования
public interface Competition {

    // метод получения участников соревнования
    List<Participant> getParticipants();

    // метод проведения соревнования, который возвращает номер победившего участника
    int compete();
}