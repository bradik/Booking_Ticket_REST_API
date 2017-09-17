DELETE FROM STATION;
DELETE FROM TRAIN;

insert into STATION (ID, NAME) values (1, 'Москва Окт');
insert into STATION (ID, NAME) values (2, 'Москва Курс');
insert into station (ID, NAME) values (3, 'St.Peterburg');

insert into TRAIN (ID, TRAIN_NUMBER, NAME) values (1, '115А', 'С-Пет-Лад — Адлер');
insert into TRAIN (ID, TRAIN_NUMBER, NAME) values (2, '029А', 'С-Петер-Гл — Москва Окт');
insert into TRAIN (ID, TRAIN_NUMBER, NAME) values (3, '031А', 'С-Петер-Гл — Москва Курс');
insert into TRAIN (ID, TRAIN_NUMBER, NAME) values (4, '037А', 'С-Петер-Гл — Москва Окт');


insert into ROUTE (ID, ARRIVAL_DATE, DEPARTURE_DATE, FROM_STATION_ID, TO_STATION_ID, TRAIN_ID) values (1, '2017-09-17 12:00:00' , '2017-09-17 18:00:00', 3, 1, 2);
insert into ROUTE (ID, ARRIVAL_DATE, DEPARTURE_DATE, FROM_STATION_ID, TO_STATION_ID, TRAIN_ID) values (2, '2017-09-17 11:30:00' , '2017-09-17 18:30:00', 1, 3, 3);
