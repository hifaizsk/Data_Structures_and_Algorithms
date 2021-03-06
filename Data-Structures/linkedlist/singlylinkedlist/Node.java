package linkedlist.singlylinkedlist;

public class Node<V> {

    private V element;
    private Node<V> next;

    public Node() {
        this(null, null);
    }

    public Node(V element, Node<V> next) {
        this.element = element;
        this.next = next;
    }

    public V getElement() {
        return element;
    }

    public void setElement(V element) {
        this.element = element;
    }

    public Node<V> getNext() {
        return next;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
