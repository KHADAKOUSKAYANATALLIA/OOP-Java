ДЗ:

Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов SOLID.
В проект нужно добавить файл readme.md, в нем перечислить участки кода, которые рефакторим,
какой принцип применяем и почему.


### 1. Принцип единственной ответственности (Single Responsibility)

Суть: Каждый класс должен отвечать только за одну операцию.

РЕШЕНИЕ:

- User - хранит атрибуты пользователя (ФИО);
- Student - хранит ID студента;
- Teacher - хранит ID учителя;
- StudentView - хранит метод вывода в консоль студентов;
- TeacherView - хранит метод вывода в консоль учителей;
- StudentController - содержит функционал по созданию студента;
- TeacherController - содержит функционал по созданию учителя.

Т.о. каждый класс узкоспециализирован и отвечает за одну операцию.

### 2. Принцип открытости-закрытости (Open-Closed)

Суть: Классы должны быть открыты для расширения, но закрыты для модификации.

РЕШЕНИЕ:

- User расширяется без изменения исходного кода за счет классов Student и Teacher, т.к. эти классы содержат ID студента
  и ID учителя.

Т.о. класс User к своему функционалу/характеристикам добавляет функционал/характеристики класса Student или Teacher, не
модифицируя ничего в своем классе.

### 3. Принцип подстановки Барбары Лисков (Liskov Substitution)

Суть: Если П является подтипом Т, то любые объекты типа Т, присутствующие в программе, могут заменяться объектами типа П
без негативных последствий для функциональности программы.

РЕШЕНИЕ:

- User (класс-родитель) имеет атрибуты пользователя - ФИО. Производные от него классы Teacher и Student (
  классы-наследники) могут быть
  использованы вместо него без нарушения корректности программы и не изменяя поведение класса User.

Т.о. класс-родитель User мы можем заменить классом-наследником Student или Teacher.

### 4. Принцип разделения интерфейсов (Interface Segregation)

Суть: Не следует ставить клиента в зависимость от методов, которые он не использует.

РЕШЕНИЕ:

- принцип выполняется, т.к. классы производят только те операции, которые необходимы для осуществления их функций.

### 5. Принцип инверсии зависимостей (Dependency Inversion)

Суть: Модули верхнего уровня не должны зависеть от модулей нижнего уровня. И те, и другие должны зависеть от абстракций.
Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

РЕШЕНИЕ:

- модули верхнего уровня не зависят от модулей нижнего уровня;
- например, классы StudentView и TeacherView имплементируют интерфейс UserView и реализуют его метод sendOnConsole().

Т.о. UserView (модуль верхнего уровня) никак не зависит от StudentView и TeacherView (модулей нижнего уровня)
