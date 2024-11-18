// The original commented-out code represents an abstract class.
// Abstract classes allow partial abstraction and can have methods with or without a body.
/*
class Computer {
    public void code() {
        // Method with no implementation
    }
}
*/

/* 
Using an interface instead of an abstract class achieves **100% abstraction**.
- An interface in Java can only contain abstract methods (before Java 8).
- This ensures that any class implementing the interface must provide its own implementation of the methods.
- The method `code` in the `Computer` interface is abstract by nature and has no body.
*/
interface Computer {
    abstract public void code();
}

// The `Laptop` class implements the `Computer` interface.
// Since we're using an interface, we replace `extends` with `implements`.
class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("code, compile, run ");
    }
}

// The `Desktop` class also implements the `Computer` interface.
// Like `Laptop`, it provides its own implementation of the `code` method.
class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

// The `Developer` class accepts an object of type `Computer` (interface) as a
// parameter.
// This demonstrates **polymorphism**: a `Developer` can work with any
// `Computer` implementation (e.g., Laptop or Desktop).
class Developer {
    public void devApp(Computer comp) {
        comp.code(); // Calls the `code` method of the specific `Computer` object passed in
    }
}

public class Demo_26Interface {
    public static void main(String[] args) {
        // Polymorphic behavior: Using interface reference to hold objects of
        // implementing classes
        Computer lap = new Laptop(); // `lap` is a `Computer`, but the object is a `Laptop`
        Computer desk = new Desktop(); // `desk` is a `Computer`, but the object is a `Desktop`

        Developer dev = new Developer(); // Create a Developer object
        dev.devApp(desk); // Calls the `code` method of the `Desktop` object
        dev.devApp(lap); // Calls the `code` method of the `Laptop` object
    }
}

/*
 * Key Differences Between Using an Interface and an Abstract Class:
 *
 * 1. Interfaces achieve 100% abstraction (pre-Java 8), meaning they only
 * contain abstract methods.
 * 2. Abstract classes can have both abstract methods (without a body) and
 * concrete methods (with a body).
 * 3. A class can implement multiple interfaces (allowing multiple inheritance
 * of type),
 * but it can only extend one abstract class due to Java's single inheritance
 * rule.
 * 4. Interfaces define a contract that must be followed by any class
 * implementing them.
 * 5. Abstract classes are used for creating a base class with shared
 * functionality, whereas interfaces
 * are typically used for defining capabilities or behaviors (e.g., `Runnable`
 * or `Serializable`).
 *
 * This example demonstrates how interfaces can be used to enforce a contract
 * for unrelated classes
 * while supporting polymorphism in Java.
 */
