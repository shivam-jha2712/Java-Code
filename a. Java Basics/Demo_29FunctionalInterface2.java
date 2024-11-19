@FunctionalInterface
interface A {
    int add(int a, int b);
}

public class Demo_29FunctionalInterface2 {
    public static void main(String[] args) {
        // A obj = new A();
        // The above can't be done directly, we can't create an object of an interface

        // BUT!!!! using anononymous inner class it can be done

        // A obj = new A() {
        // public int add(int a, int b) {
        // return a + b;
        // }
        // };
        // System.out.println("Sum: " + obj.add(5, 3));

        // Also this can acheived using lambda expressions
        // A obj = (a, b) -> a + b;

        // System.out.println("Sum: " + obj.add(5, 3));
    }
}
