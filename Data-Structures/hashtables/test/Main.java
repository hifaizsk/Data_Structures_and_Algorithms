package hashtables.test;

import hashtables.SimpleHashTable;
import linkedlist.test.Employee;

public class Main {

    public static void main(String[] args) {

        Employee johnDoe = new Employee(123, "John", "Doe");
        Employee maryJane = new Employee(4567, "Mary", "Jane");
        Employee daveSmith = new Employee(874, "Dave", "Smith");

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Doe", johnDoe);
        ht.put("Jane", maryJane);
        ht.put("Smith", daveSmith);
        ht.printHashtable();

        System.out.println(ht.get("Jane"));
        System.out.println(ht.get("CJ"));
    }
}
