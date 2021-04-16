/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacksandqueues;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        Queue queue = new Queue(3);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
    }
}
