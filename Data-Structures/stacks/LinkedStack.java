package stacks;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedStack<V> {

    private LinkedList<V> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(V element) {
        stack.push(element);
    }

    public V pop() {
        return stack.pop();
    }

    public V peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println(Arrays.toString(stack.toArray()));
    }

}
