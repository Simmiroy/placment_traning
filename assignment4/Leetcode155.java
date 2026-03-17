package assignment4;
import java.util.*;
public class Leetcode155 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        if(stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
