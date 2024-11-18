abstract class A {
    abstract public void show();

    abstract public void config();
}

public class Demo_25AbstractAnnonymousInnnerClass {
    public static void main(String[] args) {
        // Here it is similar to creating a concrete class
        // Which will be used for implementing the abstract methods of the class
        A obj = new A() {
            public void show() {
                System.out.println("in A show");
            }

            public void config() {
                System.out.println("in A config");
            }
        };
        obj.show();
    }
}
