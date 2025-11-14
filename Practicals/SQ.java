import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class SQ {
    public static void main(String[] args) {
        System.out.println("===== STACK IMPLEMENTATION =====");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);
        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("===== QUEUE IMPLEMENTATION =====");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add operations: " + queue);
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after remove: " + queue);
        System.out.println("Front element (peek): " + queue.peek());
    }
}
