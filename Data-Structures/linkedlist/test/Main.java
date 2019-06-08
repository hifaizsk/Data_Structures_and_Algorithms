package linkedlist.test;

import linkedlist.singlylinkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee johnDoe = new Employee(123, "John", "Doe");
        Employee maryJane = new Employee(4567, "Mary", "Jane");

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
    }
}
