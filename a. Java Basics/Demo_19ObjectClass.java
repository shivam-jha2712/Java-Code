class Laptop {
    String model;
    int price;

    public String toString() {
        String result = "Laptop : " + model + " Price " + price;
        return result;
    }
}

public class Demo_19ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Asus";
        obj.price = 1000;

        System.out.println(obj);
        // If an object is printed then the toString(); is called and the data is
        // printed accordingly;
    }
}
