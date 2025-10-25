
import java.util.Scanner;

class New{
    public static void main(String[] args){
        //takin input from user
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // // int name = sc.nextLine();
        // System.out.println(age); 

        //if else
        //same as other languages

        //logical operator or and and

        int cash = sc.nextInt();
        if(cash<20){
            System.out.println("cannot buy anything");
        }
        else if(cash >20 && cash <40){
            System.out.println("can get 1 thing");
        }
        else {
            System.out.print("Can get more than one item");
        }
    }
}