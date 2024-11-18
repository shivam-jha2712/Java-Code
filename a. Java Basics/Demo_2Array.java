import java.util.*;

public class Demo_2Array {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int arr[] = new int[4];
        int num[] = new int[4];
// Creating an sc object of Class Scanner, which has an input parameter
        Scanner sc = new Scanner(System.in);

        // Array input using for loop
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<num.length; i++){
            System.out.println(num[i]);
        }

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for (int i : arr) {
            System.out.println(i);
        }

        for (int i : nums) {
            System.out.println(i);
        }

    }
}
