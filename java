JAVA BASICS REFERENCE (WELL STRUCTURED)

==================================================
1. BUILD AND RUN
==================================================
javac Main.java
- Compiles source code (.java) into bytecode (.class).

java Main
- Runs the compiled class that contains main().


==================================================
2. PROGRAM ENTRY + OUTPUT
==================================================
public static void main(String[] args)
- Entry point of every Java application.

System.out.println("Hello")
- Prints with a new line.

System.out.print("Hello")
- Prints on the same line.


==================================================
3. VARIABLES, TYPES, CONSTANTS
==================================================
int age = 20;                // whole number
double price = 19.99;        // decimal
char grade = 'A';            // one character
boolean isActive = true;     // true or false
String name = "Zouhair";     // text
var count = 10;              // inferred local type (Java 10+)

final double PI = 3.14159;
- final means the value cannot change.


==================================================
4. OPERATORS
==================================================
Arithmetic: +  -  *  /  %
Comparison: ==  !=  >  <  >=  <=
Logical: &&  ||  !
Assignment shortcuts: +=  -=  *=  /=


==================================================
5. CONDITIONS
==================================================
if (age >= 18) {
	System.out.println("Adult");
} else {
	System.out.println("Minor");
}

switch (day) {
	case 1 -> System.out.println("Monday");
	case 2 -> System.out.println("Tuesday");
	default -> System.out.println("Other day");
}


==================================================
6. LOOPS
==================================================
for (int i = 0; i < 3; i++) {
	System.out.println(i);
}

while (age > 0) {
	age--;
}

do {
	System.out.println("Runs at least once");
} while (false);

for (String item : new String[] {"A", "B", "C"}) {
	System.out.println(item);
}


==================================================
7. ARRAYS + METHODS
==================================================
int[] nums = {10, 20, 30};
System.out.println(nums[0]);
System.out.println(nums.length);

static int add(int a, int b) {
	return a + b;
}

void greet() {
	System.out.println("Hi");
}


==================================================
8. CLASSES, OBJECTS, CONSTRUCTORS
==================================================
class Car {
	String model;

	Car(String model) {
		this.model = model;
	}
}

Car c = new Car("BMW");
- this.model refers to the current object's field.


==================================================
9. INHERITANCE + ABSTRACT CLASS
==================================================
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

abstract class Vehicle {
	abstract void move();
}

class Bike extends Vehicle {
	void move() {
		System.out.println("Bike moves");
	}
}


==================================================
10. INTERFACES (IMPORTANT)
==================================================
interface Shape {
	double area();
}

class Circle implements Shape {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}

// Multiple interfaces example
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


==================================================
11. ACCESS MODIFIERS
==================================================
public    : accessible everywhere
private   : only inside the same class
protected : same package + subclasses
default   : same package only (no keyword)


==================================================
12. EXCEPTIONS
==================================================
try {
	int x = 10 / 0;
} catch (ArithmeticException e) {
	System.out.println("Cannot divide by zero");
} finally {
	System.out.println("Always executes");
}

throw new IllegalArgumentException("Invalid value");


==================================================
13. COLLECTIONS (LIST, SET, MAP)
==================================================
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Java");
- List keeps order and allows duplicates.

Set<String> set = new HashSet<>();
set.add("Java");
set.add("Java");
- Set stores unique values only.


==================================================
14. MAPS (VERY IMPORTANT)
==================================================
Map<String, Integer> scores = new HashMap<>();
- Map stores data in key-value form.

scores.put("Ali", 95);
scores.put("Sara", 88);
- put adds or updates a key-value pair.

int aliScore = scores.get("Ali");
- get returns value for a key.

boolean hasAli = scores.containsKey("Ali");
- checks if key exists.

scores.remove("Sara");
- removes an entry by key.

System.out.println(scores.keySet());
- returns all keys.

System.out.println(scores.values());
- returns all values.

for (Map.Entry<String, Integer> entry : scores.entrySet()) {
	System.out.println(entry.getKey() + " -> " + entry.getValue());
}
- best way to loop over a map.


==================================================
15. STRINGS + INPUT + UTILITIES
==================================================
String text = "java basics";
System.out.println(text.length());
System.out.println(text.toUpperCase());
System.out.println(text.substring(0, 4));
System.out.println(text.equals("java basics"));

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
String line = sc.nextLine();
sc.close();

Arrays.sort(nums);
Collections.sort(list);
Math.max(5, 9);
Math.random();


==================================================
16. COMPLETE MINI EXAMPLE (INTERFACE + MAP)
==================================================
import java.util.*;

interface DiscountPolicy {
	double applyDiscount(double price);
}

class StudentDiscount implements DiscountPolicy {
	public double applyDiscount(double price) {
		return price * 0.9;
	}
}

public class Main {
	public static void main(String[] args) {
		DiscountPolicy policy = new StudentDiscount();

		Map<String, Double> products = new HashMap<>();
		products.put("Book", 100.0);
		products.put("Pen", 20.0);

		for (Map.Entry<String, Double> item : products.entrySet()) {
			double finalPrice = policy.applyDiscount(item.getValue());
			System.out.println(item.getKey() + " final price: " + finalPrice);
		}
	}
}

END OF GUIDE


==================================================
17. DETAILED WALKTHROUGH (EXPLAINED)
==================================================

A) Why Java needs main()
- Java starts execution from main().
- If main() is missing, java Main cannot run your program.

Example:
public static void main(String[] args) {
	System.out.println("Program started");
}


B) Variable type rules
- Java is strongly typed, so each variable has a fixed type.
- int cannot store text, and String cannot be used as a number directly.

Example:
int x = 10;
String y = "10";
// x + y is not valid numeric addition unless conversion is done.


C) if vs switch
- Use if for ranges or complex conditions.
- Use switch for many exact value checks.

Example (if for range):
int score = 82;
if (score >= 90) {
	System.out.println("A");
} else if (score >= 80) {
	System.out.println("B");
}


D) Loop selection
- for: best when number of iterations is known.
- while: best when loop depends on a condition.
- for-each: best to iterate arrays/collections safely.

Example:
String[] names = {"Ali", "Sara", "Omar"};
for (String n : names) {
	System.out.println(n);
}


E) this keyword in constructors
- this.field means "the field of this object".
- Used when parameter name and field name are the same.

Example:
class User {
	String name;

	User(String name) {
		this.name = name;
	}
}


F) Interface explained deeply
- Interface defines behavior contract.
- Any class implementing it must provide all methods.
- This lets you replace implementation without changing usage code.

Example:
interface Notifier {
	void send(String msg);
}

class EmailNotifier implements Notifier {
	public void send(String msg) {
		System.out.println("Email: " + msg);
	}
}

class SmsNotifier implements Notifier {
	public void send(String msg) {
		System.out.println("SMS: " + msg);
	}
}

// Same usage, different implementation:
Notifier n = new EmailNotifier();
n.send("Welcome");
n = new SmsNotifier();
n.send("Code 1234");


G) Map explained deeply
- Map stores unique keys and their values.
- Key must be unique; value can repeat.
- put with same key updates existing value.

Example:
Map<String, Integer> stock = new HashMap<>();
stock.put("Book", 5);
stock.put("Pen", 10);
stock.put("Book", 8); // updates Book from 5 to 8

System.out.println(stock.get("Book")); // 8

// Safe read pattern:
if (stock.containsKey("Pencil")) {
	System.out.println(stock.get("Pencil"));
} else {
	System.out.println("Pencil not found");
}

// Iterate key + value:
for (Map.Entry<String, Integer> e : stock.entrySet()) {
	String product = e.getKey();
	int quantity = e.getValue();
	System.out.println(product + ": " + quantity);
}


H) Common beginner mistakes
- Using == to compare strings (use equals()).
- Forgetting sc.nextLine() after nextInt().
- Forgetting to implement all interface methods.
- Getting null from map.get(key) when key does not exist.

String a = "java";
String b = new String("java");
System.out.println(a.equals(b)); // true


I) Mini real-world practice task
- Create interface TaxPolicy with method applyTax(double).
- Create class NormalTax and ReducedTax.
- Store products in Map<String, Double>.
- Print final price of each product using selected policy.

This practice combines:
- interface design
- object creation
- map iteration
- real business logic flow


END OF DETAILED GUIDE
