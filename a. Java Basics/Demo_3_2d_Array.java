import java.util.*;

public class Demo_3_2d_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
        int nums[][] = new int[3][4];  // Initialize a 2D array of size 3x4

        // Read input for the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element for nums[" + i + "][" + j + "]: ");
                nums[i][j] = scanner.nextInt();  // Read the element from the user
            }
        }

        // Print the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();  // Close the scanner to free up resources
    }
}
