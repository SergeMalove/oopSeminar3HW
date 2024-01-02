# Задание: "Библиотечная Система"
## Цель:
Создать простую систему для управления книгами в библиотеке. Система должна позволять хранить книги, сортировать их по разным критериям, а также предоставлять функционал для перебора книг.

## Шаги:
### Класс Book:

Создайте класс Book с полями: title (название), author (автор) и publishedYear (год издания).
Реализуйте конструктор, геттеры для каждого поля и метод toString().
Реализуйте интерфейс Comparable<Book> для сравнения книг по названию.  

### Компараторы:

Создайте два компаратора для класса Book: один для сортировки по автору, другой - по году издания.
### Класс Library:

Создайте класс Library, который реализует Iterable<Book>.
В классе Library должен быть список books, в котором хранятся объекты Book.
Реализуйте методы для добавления книг (addBook), получения списка всех книг (getBooks) и сортировки книг по разным критериям.
Реализуйте метод iterator() для обхода всех книг в библиотеке.
### Тестирование функционала:

В методе main создайте экземпляр класса Library и добавьте в него несколько книг.
Продемонстрируйте сортировку книг по названию, автору и году издания.
Используйте цикл for-each для перебора и вывода всех книг из Library.

### Дополнительные задачи (по желанию):
Добавьте функционал для удаления книг из библиотеки.
Реализуйте возможность фильтрации книг по определенным критериям (например, по автору или году издания).
Создайте пользовательский интерфейс (консольный или графический), чтобы упростить взаимодействие с вашей библиотечной системой.
Это задание поможет вам закрепить знания о создании и использовании классов, интерфейсов, компараторов и итераторов в Java, а также даст понимание, как эти элементы могут работать вместе в реальном приложении.