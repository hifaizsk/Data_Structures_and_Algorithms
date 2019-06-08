package linkedlist.singlylinkedlist;

public class SinglyLinkedList<V> {

    private long size;
    private Node<V> head;

    public SinglyLinkedList() {
        size = 0;
        head = null;
    }

    public void addToFront(V element) {
        Node<V> node = new Node<>(element, null);
        node.setNext(head);
        head = node;
        size++;
    }

    public long getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<V> removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        Node<V> removeNode = head;
        head = head.getNext();
        removeNode.setNext(null);
        size--;
        return removeNode;
    }

    public void printList() {
        Node<V> current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
