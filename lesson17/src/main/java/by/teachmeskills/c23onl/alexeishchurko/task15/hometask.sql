    -- Создание таблицы для хранения данных о человеке
    create table if not exists persons (
        id int primary key,
        name varchar,
        isMan boolean,
        age int
    );

    -- Создание таблицы для хранения типа хобби
    create table if not exists hobby_type (
        id int primary key,
        type varchar
    );

    -- Создание таблицы для хранения данных о хобби
    create table if not exists hobby (
        id int primary key,
        hobby_name varchar,
        -- Есть хобби как активные (несколько) так и пассивные (несколько)
        hobby_type_id int constraint fk_hobby_type references hobby_type(id)
    );

    -- Создание таблицы для хранения данных о человеке и его хобби
    create table if not exists person_hobby(
        id int primary key,
        person_id int constraint fk_person references persons(id),
        hobby_id int constraint fk_hobby references hobby(id)
    );
    -- Добавление 10 записей в таблицу для хранения людей
    insert into persons (id, name, isMan, age) values (1, 'Somebody1', true, 20),
                                                      (2, 'Somebody2', true, 25),
                                                      (3, 'Somebody3', true, 28),
                                                      (4, 'Somebody4', true, 30),
                                                      (5, 'Somebody5', true, 21),
                                                      (6, 'Somebody6', true, 17),
                                                      (7, 'Somebody7', true, 22),
                                                      (8, 'Somebody8', true, 18),
                                                      (9, 'Somebody9', true, 19),
                                                      (10, 'Somebody10', true, 27);

    -- Добавление записей о 2 типах хобби (активное, спокойное)
    insert into hobby_type (id, type) values (1, 'active'),
                                             (2, 'passive');

    -- Добавление записей с видами хобби разного типа (футбол, хоккей, чтение и т.д)
    insert into hobby (id, hobby_name, hobby_type_id) values (1,'footbal', 1),
                                                             (2,'hockey', 1),
                                                             (3,'basketball', 1),
                                                             (4,'swimming', 1),
                                                             (5,'cycling', 1),
                                                             (6,'dancing', 1),
                                                             (7,'reading', 2),
                                                             (8,'chess',2),
                                                             (9,'draw',2),
                                                             (10,'origami',2);

    -- Добавление записей в таблицу данных о человеке и его хобби с условиями, что:
    -- есть как минимум один человек с несколькими хобби
    -- есть хобби, которым увлекаются сразу несколько человек
    -- есть хобби как активные (несколько) так и пассивные (несколько)
    insert into person_hobby (id, person_id, hobby_id) values (1,1,1),
                                                              (2,1,4),
                                                              (3,1,7),
                                                              (4,2,1),
                                                              (5,2,5),
                                                              (6,2,9),
                                                              (7,3,1),
                                                              (8,3,4),
                                                              (9,4,2),
                                                              (10,5,2),
                                                              (11,5,8),
                                                              (12,6,10),
                                                              (13,6,9),
                                                              (14,7,2),
                                                              (15,7,5),
                                                              (16,8,9),
                                                              (17,8,8),
                                                              (18,9,3),
                                                              (19,10,6),
                                                              (20,10,10);

    -- Вывести всех людей старше какого-либо возраста
    select * from persons where age > 25;

    -- Вывести сколько людей каждого пола есть в бд
    select name, isMan from persons;

    -- Вывести информацию о людях и их хобби
    select *
    from persons
         join person_hobby on persons.id = person_hobby.person_id
         join hobby on person_hobby.hobby_id = hobby.id
         join hobby_type on hobby.hobby_type_id = hobby_type.id;

    select person_id, name, isMan, age, hobby_name, type
    from persons
         join person_hobby on persons.id = person_hobby.person_id
         join hobby on person_hobby.hobby_id = hobby.id
         join hobby_type on hobby.hobby_type_id = hobby_type.id;

    -- Вывести какое количество активных хобби и пассивных хобби есть в бд
    select hobby.id, hobby_name, hobby_type.type
    from hobby
         join hobby_type on hobby.hobby_type_id = hobby_type.id;

    -- Вывести информацию какое хобби активное
    select hobby_name, hobby_type.type
    from hobby
         join hobby_type on hobby.hobby_type_id = hobby_type.id where type = 'active';
    -- а какое пассивное
    select hobby_name, hobby_type.type
    from hobby
         join hobby_type on hobby.hobby_type_id = hobby_type.id where type = 'passive';

    -- Вывести список людей у которых более одного хобби
    select name, count(*) as count
    from persons
         join person_hobby on persons.id = person_hobby.person_id
    group by name having count(*) > 1 order by count;

    -- Удаление всех таблиц
    drop table if exists persons, hobby_type, hobby, person_hobby;