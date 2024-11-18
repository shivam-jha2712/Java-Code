class Calculator {
    int a;  // Declaration of instance variable 'a'
    int b;  // Declaration of instance variable 'b'

    // Method creation within a class
    public int add(int n1, int n2) {
        int r = n1 + n2;  // Calculate the sum of n1 and n2
        return r;         // Return the result
    }
}

public class Class_Objects {
    public static void main(String args[]) {
        int num1 = 4;  // Initialize num1 with value 4
        int num2 = 9;  // Initialize num2 with value 9

        Calculator calc = new Calculator();  // Create an instance of Calculator

        int result = calc.add(num1, num2);  // Call the 'add' method and store the result
        System.out.println(result);         // Print the result to the console
    }
}
