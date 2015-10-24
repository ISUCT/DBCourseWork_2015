﻿# Техническое задание

Предметная область - бухгалтерия предприятия

Задача: учет времени работы сотрудников 
Решаемые задачи: 

*     учет труда работников
*     табель учета рабочего времени составляется по подразделениям и включает ФИО работника, должность, количество отработанных часов и количество нерабочих дней за месяц     

Запросы которые должны исполнятся:

*     Упорядочение: сотрудники по подразделениям и алфавиту внутри подразделения;
*     Поиск: все сведения о сотруднике по ФИО, по табельному номеру;
*     Выборка: табель учета рабочего времени отдела NN за месяц ХХ; сведения о работе сотрудника ХХ за год;
*     Вычисления: среднее количество нерабочих дней по отделам; суммарное количество нерабочих дней по месяцам за текущий год;
*     Коррекция: удаление данных за позапрошлый год; изменение должности сотрудника ХХ с АА на ББ;


Ограничения целостности: 

*     каждый сотрудник может работать только в одном из описанных в справочнике подразделений; 
*     количество нерабочих дней на превышает общее число дней месяца; 
*     число отработанных часов не более, чем максимально возможное за месяц (при 41 часовой рабочей неделе);



# Поля таблицы

* Фамилия сотрудника
* Имя сотрудника
* Отчество сотрудника
* табельный номер сотрудника
* название подразделения
* дата и время прихода на работу
* дата и время ухода с работы
* количество рабочих дней по подразделениям
* количество нерабочих дней по подразделениям
* максимальное число рабочих часов за месяц
* день ухода в отпуск
* прихода с отпуска
* стаж (кол-во отпускных дней)




