package queues.test;

import linkedlist.test.Employee;
import queues.ArrayQueue;

public class Main {

    public static void main(String[] args) {

        Employee johnDoe = new Employee(123, "John", "Doe");
        Employee maryJane = new Employee(4567, "Mary", "Jane");
        Employee daveSmith = new Employee(874, "Dave", "Smith");

        ArrayQueue<Employee> queue = new ArrayQueue<>(10);
        queue.add(johnDoe);
        queue.add(maryJane);
        queue.add(daveSmith);
        queue.printQueue();

        System.out.println("Deque " + queue.remove());
        System.out.println("Deque " + queue.remove());
        queue.printQueue();

        System.out.println(queue.peek());
    }
}
