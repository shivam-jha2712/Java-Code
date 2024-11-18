class A {
    int age;

    public void show() {
        System.out.println("in A show");
    }

    class B {
        public void show2() {
            System.out.println("in B config");
        }
    }
}

public class Demo_23InnerClass {
    public static void main(String[] args) {
        /*
         * For A it is easy just create an object of class A and then we can call the
         * method on that object.
         */
        A obj = new A();
        obj.show();

        // But for an inner class we need to do it diffrently

        // Because if you need to create an object of B which is an inner class
        // You need the object of A which is an outer class
        A.B obj1 = obj.new B();
        obj1.show2();

        // Since, class B is a non static class thus
        // we need an object of its parent class to call it.

        // Also it is important to note that the outer class never be static
        // only the inner class can be static.
    }
}
