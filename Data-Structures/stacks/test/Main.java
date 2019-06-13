package stacks.test;

import linkedlist.test.Employee;
import stacks.ArrayStack;

public class Main {

    public static void main(String[] args) {

        Employee johnDoe = new Employee(123, "John", "Doe");
        Employee maryJane = new Employee(4567, "Mary", "Jane");
        Employee daveSmith = new Employee(874, "Dave", "Smith");

        ArrayStack<Employee> employeeArrayStack = new ArrayStack<>(10);
        employeeArrayStack.push(johnDoe);
        employeeArrayStack.push(maryJane);
        employeeArrayStack.push(daveSmith);


        employeeArrayStack.printStack();
        System.out.println(employeeArrayStack.size());

        System.out.println(employeeArrayStack.peek());
        employeeArrayStack.printStack();
        System.out.println(employeeArrayStack.size());

        System.out.println(employeeArrayStack.pop());
        System.out.println(employeeArrayStack.pop());
        System.out.println(employeeArrayStack.pop());
        employeeArrayStack.printStack();
        System.out.println(employeeArrayStack.size());

    }
}
