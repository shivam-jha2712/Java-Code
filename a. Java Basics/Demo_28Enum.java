// Enums are a special type in Java used to define a fixed set of constants.
// They are particularly useful when a variable can only take one of a small predefined set of values.
// Enums improve code readability, type safety, and provide built-in methods and features.
enum Days {
    // Enum constants are defined as comma-separated values.
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Enums can have methods, fields, and constructors (private by default).
    private String description;

    // Constructor for the enum
    // Days() {
    // // Assigning default descriptions to days
    // switch (this) {
    // case SATURDAY:
    // case SUNDAY:
    // this.description = "Weekend";
    // break;
    // default:
    // this.description = "Weekday";
    // }
    // }

    // Getter method to access the description
    public String getDescription() {
        return description;
    }
}

// Enum with custom properties and methods
enum TrafficSignal {
    // Enum constants with associated properties
    RED("Stop"), YELLOW("Slow Down"), GREEN("Go");

    private final String action;

    // Constructor to initialize the action for each constant
    TrafficSignal(String action) {
        this.action = action;
    }

    // Getter to retrieve the action
    public String getAction() {
        return action;
    }
}

public class Demo_28Enum {

    public static void main(String[] args) {
        // Basic usage of enums
        Days today = Days.WEDNESDAY; // Assigning an enum constant to a variable
        System.out.println("Today is: " + today); // Prints: WEDNESDAY
        System.out.println("Type of day: " + today.getDescription()); // Prints: Weekday

        // Looping through all enum constants using the `values()` method
        System.out.println("\nAll days with descriptions:");
        for (Days day : Days.values()) {
            System.out.println(day + " -> " + day.getDescription());
        }

        // Using enums in a switch statement
        System.out.println("\nTraffic Signal Demo:");
        TrafficSignal signal = TrafficSignal.RED;
        switch (signal) {
            case RED:
                System.out.println("Action: " + signal.getAction()); // Prints: Stop
                break;
            case YELLOW:
                System.out.println("Action: " + signal.getAction()); // Prints: Slow Down
                break;
            case GREEN:
                System.out.println("Action: " + signal.getAction()); // Prints: Go
                break;
        }

        // Accessing properties and methods of TrafficSignal enum
        System.out.println("\nAll Traffic Signals:");
        for (TrafficSignal ts : TrafficSignal.values()) {
            System.out.println(ts + " -> " + ts.getAction());
        }
    }
}

/*
 * **Detailed Explanation of Enums in Java:**
 *
 * 1. **Definition**:
 * - Enums are defined using the `enum` keyword.
 * - Enum constants are typically written in uppercase letters to indicate they
 * are constants.
 *
 * 2. **Why Use Enums?**
 * - Type Safety: Prevents invalid values. For example, if a variable is of type
 * `Days`, it can only hold one of the predefined constants.
 * - Code Clarity: Improves readability by replacing numeric or string constants
 * with meaningful names.
 *
 * 3. **Key Features**:
 * - Enums are implicitly `final` and `static`, meaning they cannot be extended.
 * - Each enum constant is an instance of the enum type.
 * - Enums can have fields, methods, and constructors.
 *
 * 4. **Methods in Enums**:
 * - `values()` : Returns an array of all enum constants.
 * - `name()` : Returns the name of the enum constant as a `String`.
 * - `ordinal()` : Returns the position of the enum constant (starting from 0).
 *
 * 5. **Custom Properties and Methods**:
 * - Enums can have private fields and constructors to associate data with each
 * constant.
 * - They can also define methods like regular classes.
 *
 * 6. **Switch with Enums**:
 * - Enums are frequently used with `switch` statements, making it easy to
 * handle cases for each constant.
 *
 * 7. **Best Practices**:
 * - Use enums to represent fixed sets of related constants, like days of the
 * week, directions, or states.
 * - Avoid overloading enums with too much logic or behavior. Keep them simple
 * and focused on their role.
 */
