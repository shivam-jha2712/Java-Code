class A {
    public A() {
        System.out.println("Object Created");
    }

    public void show() {
        System.out.println("in A Show");
    }
}

public class Demo_11AnonymousObject {
    public static void main(String args[]) {
        // Anonymous Object to be created
        new A();
        new A().show();
        // You can use the function show on the anonymous object.
        // But!!!! now you can't use it again  since, you don't have a refrence variable thus whenever you create an object using new A you are not having 


        // With an object having a refrence variable I can use the functions whereas on the other hand I can't do the same with Anonymous object.
        A obj = new A();
        obj.show();
    }
}
