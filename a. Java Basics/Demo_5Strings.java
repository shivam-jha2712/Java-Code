public class Demo_5Strings {
    public static void main (String args[]){

        // Immutable Strings: And the default property of string is that it is immutable
        String firstname = "Shivam";
    String surname = new String("jha");

    System.out.println(firstname);
    String fullname = firstname.concat(surname);
    System.out.println(fullname);

    String str = "Shivam";

    System.out.println( str == firstname);
    // This is basically implying that the data of str and firstname is stored inside the same space inside the heap memory.
    // And thus we can conclude that they are refernced to a same location.

    String name = firstname + " Jha";
    System.out.println( name == fullname); 
    // Concatination does not make it same thus we can say that
    // String is immutable in java


    // Mutable Strings: To make strings mutable you can use 
        // 1. StringBuffer          2. StringBuilder
        //  -> Thread Safe              -> Thread Unsafe

    StringBuffer sb = new StringBuffer("Shivam");
    System.out.println(sb.capacity());

    sb.append(" Jha");
    sb.insert(0, "Java Full Stack ");

    System.out.println(sb.capacity());
    System.out.println(sb);

    // Since the data has been changed you need to change the data type if you wish to convert it into string you need to use to_String
    
    }
}

