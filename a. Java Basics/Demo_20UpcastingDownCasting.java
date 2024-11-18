class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class Demo_20UpcastingDownCasting {
    public static void main(String[] args) {
        // Typecasting
        double d = 4.5;
        int i = (int) d; // data loss will take place
        System.out.println(i);

        // Upcasting : Although this happens on its own
        A obj = new B(); // => A obj = (A) new B;
        // Both are similar things
        obj.show1();
        // obj.show2(); //-- This is not valid because for an object of class B and it
        // is being refrenced via class A can never take the methods of its child class

        // Downcasting : This is done when you need to call the methods of the child
        // class
        B obj1 = (B) obj; /*
                           Here an object of class B is created
                           and it pointing to the reference variable of class A but when it is type
                           casted.
                           */
        obj1.show2();

    }
}
