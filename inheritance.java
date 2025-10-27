class Person{

    Person() {
        System.out.println("Person");
    }
    
}
class Student extends Person{

    Student() {
        System.out.println("Student");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Student s = new Student();
        //if you assign super then only accessble is the super data
        // student s = p;
        
    }
}