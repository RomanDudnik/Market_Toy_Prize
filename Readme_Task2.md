# Draw of toys in a children's goods store
## Implementation
### Decide on the main classes and properties of the program.

* Create a Toy class (constructor class) that contains the following properties:
  * **id** toys (data type int)
  * **name** text name of the toy (data type - String)
  * **count** number of toys (data type - int)
  * **frequency** toy drop frequency (weight in % of 100, data type - int)
* Data about each toy will be stored in the file **toysFile.txt**
* To work with files, we use the built-in Java-File class.
  With it, it is possible to create, open, record
  and read files.
* Next, we create a ToyStore class that will work with
  class Toy.
  In this class, we describe and implement all the necessary methods.
  For example - adding new toys (addToy), changing their frequency
  loss ("weight") changeFrequency, drawing and issuing prize money
  toys(play).
* In the ToyStore class, we create a list of toys and a list of prize toys.
  We use a random number generator to draw.
  Save and load the list of toys to a file.
* The **addToy** method accepts **id**, **name**, **count** as parameters.
  In the method, a new object of the **Toy** class is created and written to a file.
* The **changeFrequency** method accepts **id** as parameters
  and a new **frequency**("weight") of the toys. Next, the method reads the file **toysFile**
  and finds the desired toy by its **id**. After that, changes the "weight" of the toy
  and writes the changes to the file again.
* The **play** method generates a random number from 1 to 100 and compares it
  with the value of the weight of each toy. If the next number is less than or equal to the weight of the toy,
  then this toy becomes a prize.
* Prize toys are stored in **ArrayList**.
* The **getPrizeToy** method returns the first toy in the list and removes it.
  This toy is written to the **prizeFile** file.

***The program is written using OOP approach.
In this basic implementation, function calls are implemented directly through method calls.
in the **main** entry point field in the **Start** class.
Therefore, this design will be easy to improve and expand.
For example, adding new methods and creating user interfaces,
for ease of use and expansion of functionality.
All this can be discussed with the customer and added to the TK***


# Розыгрыш игрушек в магазине детских товаров
## Реализация
### Определяемся с основными классами и свойствами программы.

* Создаем класс Toy (класс-конструктор), который содержит следующие свойства:
    * **id** игрушки (тип данных int)
    * **name** текстовое название игрушки (тип данных - String)
    * **count** количество игрушек (тип данных - int)
    * **frequency** частота выпадения игрушки (вес в % от 100, тип данных - int)
* Данные о каждой игрушке будем хранить в файле **toysFile.txt**
* Для работы с файлами используем встроенный класс Java-File.
С помощью него есть возможность создавать, открывать, записывать 
и читать файлы.
* Далее создаем класс ToyStore, который будет работать с 
классом Toy.
В этом классе мы описываем и реализовываем все необходимые методы.
Например - добавления новых игрушек(addToy), изменения их частоты 
выпадения (("веса")changeFrequency), проведения розыгрыша и выдачи призовых 
игрушек(play).
* В классе ToyStore мы создаем список игрушек и список призовых игрушек.
Используем генератор случайных чисел для проведения розыгрыша.
Сохраняем и загружаем список игрушек в файл.
* Метод **addToy** принимает в качестве параметров **id**, **name**, **count**.
В методе создается новый объект класса **Toy** и записывается в файл.
* Метод **changeFrequency** принимает в качестве параметров **id** 
и новый **frequency**("вес") игрушки.Далее метод читает файл **toysFile** 
и находит нужную игрущку по её **id**. После этого изменяет "вес" игрушки 
и записывает изменения в файл заново.
* Метод **play** генерирует случайное число от 1 до 100 и сравнивает его 
со значением веса каждой игрушки. Если сл.число меньше или равно весу игрушки, 
то эта игрушка становиться призовой.
* Призовые игрушки храняться в списке **ArrayList**.
* Метод **getPrizeToy** возвращает первую игрушку из списка и удаляет её.
Эта игрушка записывается в файл **prizeFile**.

***Программа написана с использованием ООП подхода.
В данном базовом исполнении вызов функций реализован напряму через вызов методов
в поле точки входа **main** в классе **Start**. 
Поэтому данную конструкцию будет легко усовершенствовать и расширить.
Например добавлением новых методов и создания пользовательских интерфейсов, 
для удобства использования и расширения функционала.
Все это можно обговорить с заказчиком и добавить в ТЗ***
