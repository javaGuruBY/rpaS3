Task1:

Разработать программу, которая демонстрирует работу со свойствами и методами класса.
 
Функциональные требования:
 
1. Разработать класс - собака, у которого должны быть следующие характеристики:
Свойства:
Возраст (int age)
Цвет (String color)
Имя (String name)
Методы:
Голос (void voice())
Есть (void eat())
Спать (void sleep())
2. Свойства можно задавать через оператор "." либо через конструктор.
3. Методы должны выводить произвольный текст с описанием действия в консоль.

Solution:

```java
public class DogDemo
{
    public static void main(String [] args)
    {
       Dog MyDog = new Dog();
       MyDog.age = 5;
       MyDog.color = "White";
       MyDog.name = "Simon";
       MyDog.voice();
       MyDog.eat(MyDog.name);
       MyDog.sleep(MyDog.name);
    }
}

class Dog
{
    int age;
    String color;
    String name;
    void voice()
    {
        System.out.println("Auf");
    }
    void eat(String name)
    {
        System.out.println(name+ " is eating");
    }
    void sleep(String name)
    {
        System.out.println(name+ " is sleeping");
    }
}
```

Task2:

Разработать программу, которая демонстрирует работу с методами класса, зависящими от свойств объекта.
 
Функциональные требования:
 
1. Разработать класс - человек, у которого должны быть следующие характеристики:
Свойства:
  Имя (String name)
  Возраст (int age)
Методы:
   Приветствие (void greet()) - должен выводить на экран имя и возраст человека.1P
2. Свойства нужно задавать через конструктор.

Solution:

```java
public class HumanDemo
{
    public static void main(String [] args)
    {
        Human Person = new Human("Bob", 29);
        Person.greeting(Person.name, Person.age);
    }
}

class Human
{
    String name;
    int age;
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void greeting(String name, int age)
    {
        System.out.println("Hi! My name is "+ name+ ", I'm "+ age+ " years old");
    }
}
```

Task3:

Разработать программу, которая демонстрирует работу с классом, а также его объектами.
 
Функциональные требования:
 
1. Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства:
    Радиус (double radius)
Методы:
    Расчет площади (double calculateArea())
2. Свойства можно задавать через оператор ".", либо через конструктор.

Solution:

```java
public class CircleDemo
{
    public static void main(String [] args)
    {
        Circle c1 = new Circle();
        c1.radius = 5;
        System.out.println(c1.calculateArea(c1.radius)+ "π");
    }
}

class Circle
{
    double radius;
    double calculateArea(double num)
    {
        num *= num;
        return num;
    }
}
```

Task4:

Разработать программу, которая демонстрирует работу с различными типами методов.

Функциональные требования:
 
1. Разработать класс - кодировщик, у которого должны быть следующие характеристики:
Методы:
    Преобразование кода в символ и вывод на экран (void encode(short code))1P
    Преобразование символ в код и вывод на экран (void decode(char symbol))2P
    
Solution:

```java
public class EncoderDemo
{
    public static void main(String [] args)
    {
        short num = 70;
        char symbol = 'C';
        Encoder function = new Encoder();
        function.encode(num);
        function.decode(symbol);
    }
}

class Encoder
{
    void encode(short code)
    {
        char s = (char)code;
        System.out.println(code+ " => '"+ s+ "'");
    }
    void decode(char symbol)
    {
        short a = (short)symbol;
        System.out.println(symbol+ " => '"+ a+ "'");
    }
}
```

Task5:

Разработать программу, которая позволяет создавать продукт с произвольным именем, стоимостью, а также расчетом стоимости с учетом скидки.
 
Функциональные требования:
 
1. Разработать класс - продукт, у которого должны быть следующие характеристики:
Свойства:
    Наименование (String name)
    Стандартная цена (double regularPrice)
    Скидка в процентах (double discount)
Методы:
Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Solution:

```java
public class ProductDemo
{
    public static void main(String [] args)
    {
        Product something = new Product("Banana");
        something.RegularPrice = 69.69;
        something.discount = 69;
        double relevantPrice = something.actualPrice(something.RegularPrice, something.discount);
        something.printInformation(something.name, something.RegularPrice, something.discount, relevantPrice);
    }
}

class Product
{
    String name;
    double RegularPrice;
    double discount;
    public Product(String name)
    {
        this.name = name;
    }
    double actualPrice(double price, double discount)
    {
        return price*discount/100;
    }
    void printInformation(String name, double price, double discount, double relevantPrice)
    {
        System.out.println("Product : name = \""+ name+ "\", regular price = "+ price);
        System.out.print("EUR, discount = "+ discount+ "%, actual price = ");
        System.out.printf("%.2f", relevantPrice);
        System.out.print(" EUR");
    }
}
```














