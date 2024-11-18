// Base class Calc with a method for addition
class Calc {
    // Method to add two integers and return the result
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

// Derived class AdvCalc that extends Calc
class AdvCalc extends Calc {
    // Overridden method to add two integers and add an extra 1 to the result
    @Override
    public int add(int n1, int n2) {
        return n1 + n2 + 1; // Adds 1 to the sum for a modified result
    }
}

public class Demo_14MethodOverriding {
    public static void main(String[] args) {
        // Create an object of the derived class AdvCalc
        AdvCalc obj = new AdvCalc();

        // Call the overridden add method from AdvCalc
        int n = obj.add(15, 2); // Calls AdvCalc's add method, which adds 1 to the sum

        // Print the result, which will be 18 (15 + 2 + 1)
        System.out.println(n);
    }
}
