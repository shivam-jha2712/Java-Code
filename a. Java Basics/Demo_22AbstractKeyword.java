/*
    Note: Abstract methods can only be defined in abstract classes.
    Else they will throw exception errors
*/

abstract class Car { // An abstract class Car
    // Abstract method of the class car is drive
    abstract public void drive();
    /*
     * Abstract Methods : These are the methods which don't have any implementation
     * they are ones which are only declared and are later defined in the concrete
     * classes;
     */

    public void playMusic() {
        System.out.println("Playing music");
    }

}

class WagonR extends Car { // Concrete class for the implementation of the abstract class methods

    // Also it is mandatory for the extended class for an abstract class to have the
    // defination of the abstract methods, else it will give an error.
    public void drive() {
        System.out.println("It can drive");
    }

}

public class Demo_22AbstractKeyword {
    public static void main(String[] args) {

        // Car obj1 = new Car; // And an object of an abstract class can't be created
        // thus we need a concrete class for its implentation

        // But we can create a refrence variable of an abstract class pointing to an
        // object of concrete class
        Car obj1 = new WagonR();

        // But for having an abstract class to create its object is not possble thus we
        // need a concrete class to extends its abstract functionalities.
        WagonR obj = new WagonR();
        obj1.drive();
        obj1.playMusic();
        obj.drive();
        obj.playMusic();

    }
}
