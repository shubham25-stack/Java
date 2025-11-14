package shapes;

public class TestPolymorphism {
    public static void main(String[] args) {
        // Dynamic Polymorphism: Reference of Interface to Object of Class
        Shape s;

        s = new Circle(5.0);  // Circle object
        s.draw();
        System.out.println("Area of Circle: " + s.area());
        System.out.println();

        s = new Rectangle(4.0, 6.0);  // Rectangle object
        s.draw();
        System.out.println("Area of Rectangle: " + s.area());
    }
}
