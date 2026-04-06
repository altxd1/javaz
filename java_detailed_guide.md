# Java Ready-to-Run Lessons

This file is now in ready-to-run lesson format.
Each lesson below is a complete standalone class.

## How to run each lesson

1. Copy one lesson into a file with the same class name.
2. Compile:

```bash
javac ClassName.java
```

3. Run:

```bash
java ClassName
```

Example:
- Save lesson 1 as `Lesson01_Hello.java`
- Run `javac Lesson01_Hello.java`
- Run `java Lesson01_Hello`

---

## Lesson 01: Hello + Output

```java
public class Lesson01_Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.print("Print without newline -> ");
        System.out.println("done");
    }
}
```

## Lesson 02: Variables + Constants

```java
public class Lesson02_Variables {
    public static void main(String[] args) {
        int age = 20;
        double price = 19.99;
        char grade = 'A';
        boolean active = true;
        String name = "Zouhair";
        final double PI = 3.14159;

        System.out.println("age = " + age);
        System.out.println("price = " + price);
        System.out.println("grade = " + grade);
        System.out.println("active = " + active);
        System.out.println("name = " + name);
        System.out.println("PI = " + PI);
    }
}
```

## Lesson 03: Operators

```java
public class Lesson03_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));

        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
    }
}
```

## Lesson 04: If + Switch

```java
public class Lesson04_Conditions {
    public static void main(String[] args) {
        int score = 82;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C or below");
        }

        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Other day");
        }
    }
}
```

## Lesson 05: Loops

```java
public class Lesson05_Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("for i = " + i);
        }

        int n = 2;
        while (n > 0) {
            System.out.println("while n = " + n);
            n--;
        }

        int k = 0;
        do {
            System.out.println("do-while runs at least once, k = " + k);
            k++;
        } while (k < 1);
    }
}
```

## Lesson 06: Arrays + Methods

```java
public class Lesson06_ArraysMethods {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        System.out.println("first = " + nums[0]);
        System.out.println("length = " + nums.length);
        System.out.println("add(5, 7) = " + add(5, 7));
    }
}
```

## Lesson 07: Class + Object + Constructor

```java
class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void show() {
        System.out.println("Car model: " + model);
    }
}

public class Lesson07_ClassObject {
    public static void main(String[] args) {
        Car c = new Car("BMW");
        c.show();
    }
}
```

## Lesson 08: Inheritance + Override

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Lesson08_Inheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        a1.sound();
        a2.sound();
    }
}
```

## Lesson 09: Abstract Class

```java
abstract class Vehicle {
    abstract void move();
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike moves");
    }
}

public class Lesson09_AbstractClass {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.move();
    }
}
```

## Lesson 10: Interface (Core)

```java
interface Shape {
    double area();
}

class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Lesson10_Interface {
    public static void main(String[] args) {
        Shape s = new Circle(4.0);
        System.out.println("Area = " + s.area());
    }
}
```

## Lesson 11: Multiple Interfaces

```java
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class Lesson11_MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone();
        p.takePhoto();
        p.playMusic();
    }
}
```

## Lesson 12: Exceptions

```java
public class Lesson12_Exceptions {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally always runs");
        }
    }
}
```

## Lesson 13: List + Set

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson13_ListSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        System.out.println("List: " + list);

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        System.out.println("Set: " + set);
    }
}
```

## Lesson 14: Map Basics (Important)

```java
import java.util.HashMap;
import java.util.Map;

public class Lesson14_MapBasics {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Ali", 95);
        scores.put("Sara", 88);
        scores.put("Ali", 97); // update existing key

        System.out.println("Ali score = " + scores.get("Ali"));
        System.out.println("Has Sara? " + scores.containsKey("Sara"));

        for (Map.Entry<String, Integer> e : scores.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
```

## Lesson 15: Scanner Input

```java
import java.util.Scanner;

public class Lesson15_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", age " + age);
        sc.close();
    }
}
```

## Lesson 16: Final Mini Project (Interface + Map)

```java
import java.util.HashMap;
import java.util.Map;

interface DiscountPolicy {
    double applyDiscount(double price);
}

class StudentDiscount implements DiscountPolicy {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}

public class Lesson16_MiniProject {
    public static void main(String[] args) {
        DiscountPolicy policy = new StudentDiscount();

        Map<String, Double> products = new HashMap<>();
        products.put("Book", 100.0);
        products.put("Pen", 20.0);
        products.put("Bag", 250.0);

        for (Map.Entry<String, Double> item : products.entrySet()) {
            double finalPrice = policy.applyDiscount(item.getValue());
            System.out.println(item.getKey() + " final price: " + finalPrice);
        }
    }
}
```

---

## Suggested learning order

1. Lesson01 to Lesson06: language basics
2. Lesson07 to Lesson11: OOP and interfaces
3. Lesson12 to Lesson16: exceptions, collections, maps, mini project

You can now compile and run each lesson one by one.
