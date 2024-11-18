// Interface A defines a contract with two methods: `show` and `config`.
// By default, all methods in an interface are `public abstract` (implicitly).
// Variables in an interface are implicitly `public static final` (constants).
interface A {
    void show(); // Abstract method to be implemented by any class implementing A

    void config(); // Abstract method to be implemented by any class implementing A
}

// Interface X defines a contract with one method: `run`.
interface X {
    void run(); // Abstract method to be implemented by any class implementing X
}

// Interface Y extends interface X.
// This demonstrates interface inheritance: any class implementing Y must also
// implement X's methods.
interface Y extends X {
    // Y inherits the `run` method from X; no additional methods are defined here.
}

// Class B implements both interfaces A and Y.
// Since Y extends X, class B must implement methods from A, X, and any
// inherited methods from Y.
class B implements A, Y {

    // Implementation of the `show` method from interface A
    public void show() {
        System.out.println("in show");
    }

    // Implementation of the `config` method from interface A
    public void config() {
        System.out.println("in config");
    }

    // Implementation of the `run` method from interface X (inherited by Y)
    public void run() {
        System.out.println("in run");
    }
}

// The main class to demonstrate the usage of interfaces and their
// implementations
public class Demo_26InterfaceDemo {
    public static void main(String[] args) {
        // Using interface reference A to hold an object of class B
        A obj = new B(); // Polymorphic behavior: `obj` can only access methods defined in interface A
        obj.show(); // Calls the `show` method of class B
        obj.config(); // Calls the `config` method of class B

        // Using interface reference X to hold an object of class B
        X obj1 = new B(); // Polymorphic behavior: `obj1` can only access methods defined in interface X
        obj1.run(); // Calls the `run` method of class B
    }
}

/*
 * Key Concepts Demonstrated:
 *
 * 1. **Interface Basics**:
 * - Interfaces define a contract with abstract methods.
 * - Methods in interfaces are `public abstract` by default.
 * - Variables in interfaces are `public static final` by default (constants).
 *
 * 2. **Interface Inheritance**:
 * - Interface Y extends interface X, demonstrating that interfaces can inherit
 * other interfaces.
 * - Any class implementing Y must also implement all methods defined in X.
 *
 * 3. **Multiple Interface Implementation**:
 * - Class B implements two interfaces (A and Y), demonstrating multiple
 * inheritance of type.
 * - Class B provides concrete implementations for all abstract methods in both
 * A and Y.
 *
 * 4. **Polymorphism**:
 * - References of type `A` and `X` are used to refer to an object of class B.
 * - Each reference can only access methods defined in its respective interface.
 * - This highlights the flexibility and extensibility of interfaces.
 *
 * 5. **Code Behavior**:
 * - `obj.show()` and `obj.config()` call methods defined in interface A but
 * implemented by class B.
 * - `obj1.run()` calls the method defined in interface X (inherited by Y) but
 * implemented by class B.
 */
