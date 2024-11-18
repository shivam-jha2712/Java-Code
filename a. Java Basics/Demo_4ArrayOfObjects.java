
class Student{
    int roll;
    int marks;
    String name;
// If we don't have the constructor and then we wish to print its varible values then it will be having default value for each variable; 
    Student(int roll, int marks, String name){

    }
};

public class Demo_4ArrayOfObjects {
    public static void main(String args[]){
        Student s1 = new Student(0, 0, null);
        s1.roll = 1;
        s1.marks = 97;
        s1.name = "Shivam";

        Student s2 = new Student(0, 0, null);
        s2.roll = 2;
        s2.marks = 87;
        s2.name = "Shiv";

        Student s3 = new Student(0, 0, null);
        s3.roll = 3;
        s3.marks = 77;
        s3.name = "Shiva";

        // Student s4 = new Student(0, 0, null);
        
        
        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        // For Each Loop in 
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }

        // Simple for loop
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks  );
        }
    }
}
