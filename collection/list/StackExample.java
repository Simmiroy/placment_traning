package collection.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());             //display the top element is the last , because stack is LIFO.
        System.out.println("Size "+ stack.size());
        stack.pop();    // Remove the top element
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
