public class SSB {
    public static void main(String[] args) {
        System.out.println("===== Using String (Immutable) =====");
        String s1 = "Hello";
        System.out.println("Original String: " + s1);
        s1 = s1 + " World";  // Concatenation creates a new object (immutable)
        System.out.println("After Concatenation: " + s1);
        System.out.println("Length of String: " + s1.length());  // Using string methods
        System.out.println("Character at index 3: " + s1.charAt(3));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Substring(2,7): " + s1.substring(2,7));

        System.out.println("\n===== Using StringBuffer (Mutable) =====");
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);
        sb.append(" World");   // Append adds content without creating new object
        System.out.println("After Append: " + sb);
        sb.insert(5, ",");  // Insert, Replace, Reverse
        System.out.println("After Insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After Replace: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
