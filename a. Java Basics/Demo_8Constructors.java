class Human{
    // These are the encapsulated value of the class
    private int age;
    private String name;

    // Even if we don't have the get and set methods we can use constructors to get us our instance of objects
    /*
     * Constructors are special methods, having the same name as Class, that don't have a return type and are used to create an object of the class instance.
     * There are two types of constructors: 
     * 1. Default Constructor: Does not has params and is given by default to us by java
     * 2. Parameterised Constructor: Has Params, and needs to be created with the use of instance variable.
     *
     *  Actually we do have the constructors by default created by java. 
     * And to have a parameterised constructor we need to define it
     * 
     */
    public Human(){
        age = 22;
        name = "Shivam";
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    // public void setName(String n){
    //     name = n;
    // }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
        

}

public class Demo_8Constructors{
    public static void main (String args[]){

        Human man = new Human(); // Object creation using default constructor
        Human woman = new Human(26, "Pragati"); // Object creation using parameterised constructor
        
        System.out.println(man.getName() + " : " + man.getAge());
        System.out.println(woman.getName() + " : " + woman.getAge());

        man.setName("Barun");
        man.setAge(27);
        
        System.out.println(man.getName() + " : " + man.getAge());
        System.out.println(woman.getName() + " : " + woman.getAge());

    }
}