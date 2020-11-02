/**
 * Author: Jack Hughes
 * StackNodeDriver.java
 * This program is the driver for my Stack class. I will use it for testing purposes.
 * Date: 10-30-20
 * On My Honor: JH
 */
public class StackNodeDriver {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.peek());
        stack.push(69);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
