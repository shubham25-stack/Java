
import java.util.Scanner;

class Project{
    public static void main(String[] args){
        int myNum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess my number : ");
        int userNumber = sc.nextInt();
        
        do {
            if(userNumber == myNum){
                System.out.println("WOOHOOoo.... correct number!!!");
            }
            else if(userNumber > myNum){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }

            if(userNumber != myNum){
                System.out.println("Guess again: ");
                userNumber = sc.nextInt();
            }
        } while(userNumber != myNum);

        System.out.println("My number was : " + myNum);
    }
}
//gues the number user do and i have to generate the number from random and till we do when user got the real number.
//