class A{
    public A()
    {
        super(); // this is by default present inside the constructor of a class
        System.out.println("In Constructor in A");
    }

    public A(int n)
    {
        super();
        System.out.println("In Constructor in A int");
    }
}

class B extends A{
    public B()
    {
        super();
        // super(5); // this will give us the costructor that will be having the parameterised value to it.
        System.out.println("In Constructor in B");
    }

    public B(int n)
    {
        // this(); // this will call the given constructor along with the parameterised constructor.
        // super(n); // this is used if you wish to call the parameterised constructor of parent class
        super(); // this is by default present inside the constructor of a class
        System.out.println("In Constructor in B int");
    }
}

public class Demo_10ThisAndSuper{
    public static void main(String[] args) {
        // Calling an object of class B
        B obj = new B();
        // B obj1 = new B(5);
    }
}