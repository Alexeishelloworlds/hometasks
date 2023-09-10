    create table if not exists cities (
        id int primary key,
        city_name varchar
    );

    create table if not exists students(
        id int primary key,
        student_name varchar,
        city_id int constraint fk_cities references cities(id)
    );

    insert into cities (id, city_name) values (1, 'Minsk'),
                                              (2, 'Moskow'),
                                              (3, 'Kiev'),
                                              (4, 'Warsaw'),
                                              (5, 'London'),
                                              (6, 'Berlin'),
                                              (7, 'Paris'),
                                              (8, 'Beijing'),
                                              (9, 'Tokyo'),
                                              (10, 'Washington');

    insert into students (id, student_name, city_id) values (1, 'somebody1', 1),
                                                            (2, 'somebody2', 2),
                                                            (3, 'somebody3', 3),
                                                            (4, 'somebody4', 4),
                                                            (5, 'somebody5', 5),
                                                            (6, 'somebody6', 6),
                                                            (7, 'somebody7', 7),
                                                            (8, 'somebody8', 8),
                                                            (9, 'somebody9', 9),
                                                            (10, 'somebody10', 10);