@FunctionalInterface
interface A {
    void show();
}

public class Demo_29FunctionalInterface {
    public static void main(String[] args) {
        // A obj = new A();
        // The above can't be done directly, we can't create an object of an interface

        // BUT!!!! using anononymous inner class it can be done

        // A obj = new A() {
        // public void show() {
        // System.out.println("In Show");
        // }
        // };

        // Also this can acheived using lambda expressions
        A obj = () -> {
            System.out.println("In Show");
        };

        obj.show();
    }
}
