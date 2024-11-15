import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackNQueue {

    public static void main(String[] args) {
        // Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Queue implementation
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue: " + queue);
        System.out.println("Removed from queue: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}