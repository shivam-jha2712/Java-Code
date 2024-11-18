class Human{
    // These are the encapsulated value of the class
    private int age;
    private String name;

    // As the properties are privately encapsulated you need publicly accessable methods to access these properties
    
    // Now to access these encapsulated value we need methods which are namely 
    // 1. getters- for getting the value    2. setters - for setting the value (always void as its return type)
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

public class Demo_7Enacpsulation{
    public static void main (String args[]){

        Human man = new Human();
        man.setName("Shivam");
        man.setAge(22);
        
        System.out.println(man.getAge());
        System.out.println(man.getName());

    }
}