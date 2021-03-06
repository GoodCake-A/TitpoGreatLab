# Требование к проекту

## Содержание

1. [Введение](SRS.md#1-%D0%B2%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5)  
1.1 [Назначение](SRS.md#11-%D0%BD%D0%B0%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5)  
1.2 [Бизнес требования](SRS.md#12-%D0%B1%D0%B8%D0%B7%D0%BD%D0%B5%D1%81-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)  
1.2.1 [Границы проекта](SRS.md#121-%D0%B3%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D1%8B-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B0)  
1.3 [Аналоги](SRS.md#13-%D0%B0%D0%BD%D0%B0%D0%BB%D0%BE%D0%B3%D0%B8)  

2. [Требования пользователя](SRS.md#2-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F)  
2.1 [Программные интерфейсы](SRS.md#21-%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%8C%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D1%8B)  
2.2 [Интерфейс пользователя](SRS.md#22-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F)  
2.3 [Характеристики пользователей](SRS.md#23-%D1%85%D0%B0%D1%80%D0%B0%D0%BA%D1%82%D0%B5%D1%80%D0%B8%D1%81%D1%82%D0%B8%D0%BA%D0%B8-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9)  
2.4 [Предположения и зависимости](SRS.md#24-%D0%BF%D1%80%D0%B5%D0%B4%D0%BF%D0%BE%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B8-%D0%B7%D0%B0%D0%B2%D0%B8%D1%81%D0%B8%D0%BC%D0%BE%D1%81%D1%82%D0%B8)  

3. [Системные требования](SRS.md#3-%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%BD%D1%8B%D0%B5-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)  
3.1 [Функциональные требования](SRS.md#31-%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)  
3.2 [Нефункциональные требования](SRS.md#32-%D0%BD%D0%B5%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D1%82%D1%80%D0%B5%D0%B1%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)  
3.2.1 [Атрибуты качества](SRS.md#321-%D0%B0%D1%82%D1%80%D0%B8%D0%B1%D1%83%D1%82%D1%8B-%D0%BA%D0%B0%D1%87%D0%B5%D1%81%D1%82%D0%B2%D0%B0)  
3.2.2 [Внешний интерфейс](SRS.md#322-%D0%B2%D0%BD%D0%B5%D1%88%D0%BD%D0%B8%D0%B9-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81)  

### 1. Введение

#### 1.1 Назначение
Bus stop tracker - приложение, предназначенное для просмотра автобусов прибывающих к остановке.

#### 1.2 Бизнес-требования

##### 1.2.1 Границы проекта

Приложение предоставляет следующие возможности:
* Возможность отслеживать время прибытия ближайших автобусов(в двух направлениях, если таковые имеются) для выбранной остановки.
* Возможность добавления новой остановки для отслеживания.
* Возможность удаления остановки из отслеживаемых.
* Возможность просмотра остановок в выбранном маршруте для их добавления.

#### 1.3 Аналоги

* Минск Транспорт - расписания - это приложение для просмотра расписания автобусов, троллейбусов и трамваев в Минке. Имеет возмость отслеживать прибытие транспорта к остановке, но только одного избранного маршрута. 
* ZippyBus - это расписание транспорта в различных городах. Расписание часто бывает не актуальным.

### 2. Требования пользователя

#### 2.1 Программные иньерфейсы

* Java - строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems (в последующем приобретённой компанией Oracle). Разработка ведётся сообществом, организованным через Java Community Process, язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle.
* Kotlin - статически типизированный, объектно-ориентированный язык программирования, работающий поверх Java Virtual Machine и разрабатываемый компанией JetBrains. Язык полностью совместим с Java. 
* Android Studio - интегрированная среда разработки (IDE) для работы с платформой Android, анонсированная 16 мая 2013 года на конференции Google I/O.Android Studio, основанная на программном обеспечении IntelliJ IDEA от компании JetBrains, — официальное средство разработки Android приложений. Данная среда разработки доступна для Windows, macOS и Linux. 17 мая 2017, на ежегодной конференции Google I/O, Google анонсировал поддержку языка Kotlin, используемого в Android Studio, как официального языка программирования для платформы Android в дополнение к Java и С++.

#### 2.2 Интерфейс пользователя 

Графический интерфейс проекта представлен с помощью макетов.

#### 2.3 Характеристики пользователей

Данное приложение будет интересно для людей нуждающихся в отслеживании автобусов в райнах с обилием альтернативных маршрутов и имеющих устройства,работающие на операционной системе Android.

#### 2.4 Предположения и зависимости

Данное приложение поддерживается на устройствах под управлением операционной системой Android.

### 3. Системные требования

Для работы данного приложения требуется операционная система Android.

#### 3.1 Функциональные требования

Пользователю предоставлены возможности:

* Функция добавления остановки в избранное. Остановка выбирается из списка остановок в маршрутах.
* Функция отслеживания прибытия автобусов к остановке. Отображается время двух ближайших прибытий для каждого маршрута. Если маршрут проходит через остановку в двух направлениях, отображаются оба с пояснениями о направлении(направление задается конечной остановкой).
* Функция удаления остановки из избранного.
* Функция просмотра машрутов автобусов и остановок в них в обоих направлениях(с возможностью переключения направления)



#### 3.2 Нефункциональные требования

##### 3.2.1 Атрибуты качества

* Понятность.
* Удобный пользовательский интерфейс.

##### 3.2.2 Внешний интерфейс

Пользовательский интерфейс должен быть понятным и удобным для использования пользователем.
