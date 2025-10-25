
// import java.util.Arrays;

class Main {
    public static void main(String[] args){

        //initialise array for int
        // int[] marks = new int[3];
        // marks[0] = 98;
        // marks[1]=96;
        // marks[2]=95;
        // System.out.println(marks.length);
        // Arrays.sort(marks);

        // int[] marks = {89,23,98,78}; //initialise the array

        //initialising 2d array
        int[][] finalMarks = {{89,76,34},{90,98,96}};
        System.out.println(finalMarks[1][2]);

        //casting 
        //implicit casting
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        //Explicit casting double to integer biger to smaller in these type of thing we can loose some data in it.
        int p = 100;
        int fp = p + (int)18.08;
        System.out.println(fp);

        //constraints for making unchangable
        final int AGE = 30;
        // age = 31;
        // age = 32; here we are unable to change in it

        // operators
        //+.,-,*,/

        //max min by math
        int a =29;
        int b = 24;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    
        //random it return random value
        System.out.println((int)(Math.random()*100));
    }
}