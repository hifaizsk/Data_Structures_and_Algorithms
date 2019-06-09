package linkedlist.doublylinkedlist;

public class DoublyLinkedList<V> {

    private Node<V> head;
    private Node<V> tail;
    private long size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(V element) {
        Node<V> node = new Node<>(element);

        if (null == head) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(V element) {
        Node<V> node = new Node<>(element);
        if (null == tail) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public boolean addBefore(V newElement, V existingElement) {

        if (isEmpty()) {
            return false;
        }

        Node<V> current = head;
        while ((null != current) && !current.getElement().equals(existingElement)) {
            current = current.getNext();
        }

        if (null == current) {
            return false;
        }

        Node<V> newNode = new Node<>(newElement);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }
        size++;

        return true;
    }

    public Node<V> removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Node<V> removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public Node<V> removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        Node<V> removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public Node<V> getHead() {
        return head;
    }

    public void setHead(Node<V> head) {
        this.head = head;
    }

    public Node<V> getTail() {
        return tail;
    }

    public void setTail(Node<V> tail) {
        this.tail = tail;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void printList() {
        Node<V> current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
}
