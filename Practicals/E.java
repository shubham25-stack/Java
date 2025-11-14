import java.util.Scanner;

public class E { // Exception Example

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (always runs).");
            sc.close();
        }
        System.out.println("Program ended normally.");
    }
}
