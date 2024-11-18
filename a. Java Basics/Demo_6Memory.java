class Calculator {
    // Instance variable is num, initialized to 5
    int num = 5;

    // Method to add two numbers
    // Local variables are n1 and n2
    public int add(int n1, int n2) {
        return n1 + n2;  // Return the sum of n1 and n2
    }
}

public class Demo_6Memory {
    public static void main(String[] args) {
        // obj & obj1 are the reference variable to the object created in the heap memory
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int r1 = obj.add(3, 4);  // Call the add method with arguments 3 and 4
        System.out.println(r1);  // Print the result of the addition

        obj.num = 8;  // Modify the instance variable num for obj
        System.out.println(obj.num);  // Print the value of num for obj (8)
        System.out.println(obj1.num); // Print the value of num for obj1 (still 5)
    }
}
