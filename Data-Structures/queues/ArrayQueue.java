package queues;

import java.util.NoSuchElementException;

public class ArrayQueue<V> {

    private V[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = (V[]) new Object[capacity];
    }

    public void add(V element) {
        if (size() == queue.length - 1) {
            int numItems = size();
            V[] newElement = (V[]) new Object[2 * queue.length];
            System.arraycopy(queue, front, newElement, 0, queue.length - front);
            System.arraycopy(queue, 0, newElement, queue.length - front, back);
            queue = newElement;
            front = 0;
            back = numItems;
        }

        queue[back] = element;

        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    public V remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        V element = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }

        return element;
    }

    public V peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }


    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}