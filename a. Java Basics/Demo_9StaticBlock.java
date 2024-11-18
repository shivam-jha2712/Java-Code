class Mobile{
    int price;
    String brand;
    static String name;

    // Constructor
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println(" in constructor call");
    }

    // Static block
    static{
        name = "SmartPhone";
        System.out.println("This is to justify that a static block is executed only once, no matter how many times a constructor is called");
        System.out.println(" is a staic block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Demo_9StaticBlock{

    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price = 1500;
        
        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price = 1700;
// Before change in static variable at one place all the changes can be reflected
        obj1.show();
        obj2.show();

        Mobile.name = "Phone";

        // After change in static variable at one place all the changes can be reflected
        obj1.show();
        obj2.show();
    }
}
