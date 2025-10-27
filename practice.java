class Students{
    String name;
    static String college;
    void f1(){
        System.out.println(name);
        System.out.println(college);
    }
    static void f2(){
        System.out.println(college);
    }
}

//static only static ko access krega but non static kisiko acces krrr skte h

public class practice{
    public static void main(String[] args){
        // Students.college = "ABC";
        // Students.f2();
        // System.out.println();
        Students s1,s2;
        s1 = new Students();
        s2 = new Students();
        s1.name = "Raju";
        s2.name= "Abhi";
        s1.college = "ABC";
        s1.f1();
        s2.f1();
    }
}