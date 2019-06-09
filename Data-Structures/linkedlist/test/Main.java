package linkedlist.test;

import linkedlist.doublylinkedlist.DoublyLinkedList;
import linkedlist.singlylinkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee johnDoe = new Employee(123, "John", "Doe");
        Employee maryJane = new Employee(4567, "Mary", "Jane");
        Employee daveSmith = new Employee(874, "Dave", "Smith");

        SinglyLinkedList<Employee> employeeList = new SinglyLinkedList<>();
        employeeList.addToFront(johnDoe);
        employeeList.addToFront(maryJane);

        employeeList.printList();

        employeeList.removeFromFront();
        System.out.println(employeeList.getSize());
        System.out.println(employeeList.isEmpty());
        employeeList.printList();

        employeeList.removeFromFront();
        System.out.println(employeeList.getSize());
        System.out.println(employeeList.isEmpty());
        employeeList.printList();

        DoublyLinkedList<Employee> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addToFront(johnDoe);
        doublyLinkedList.addToFront(maryJane);

        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.addToEnd(daveSmith);
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromFront();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromEnd();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromEnd();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromFront();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.removeFromEnd();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

        doublyLinkedList.addToFront(johnDoe);
        doublyLinkedList.addToFront(maryJane);
        doublyLinkedList.printList();

        doublyLinkedList.addBefore(daveSmith, johnDoe);
        doublyLinkedList.printList();
    }
}
