class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class Demo_24AnonymousInnerClass {
    public static void main(String[] args) {
        // This is how you create an anonymous class and then make the required changes
        // as per needs

        // The parenthesis define an inner class having all the data regarding class A
        // and can be used accordingly
        A obj = new A() {
            public void show() {
                System.out.println("in New show");
            }
        };
        obj.show();
    }
}
