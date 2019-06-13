package stacks;

import java.util.EmptyStackException;

public class ArrayStack<V> {

    private V[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = (V[]) new Object[capacity];
    }

    public void push(V element) {
        if (top == stack.length) {
            V[] newElement = (V[]) new Object[2 * stack.length];
            System.arraycopy(stack, 0, newElement, 0, stack.length);
            stack = newElement;
        }

        stack[top++] = element;
    }

    public V pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        V element = stack[--top];
        stack[top] = null;
        return element;
    }

    public V peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
