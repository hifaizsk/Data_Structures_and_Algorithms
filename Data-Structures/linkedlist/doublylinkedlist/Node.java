package linkedlist.doublylinkedlist;

public class Node<V> {

    private V element;
    private Node<V> next;
    private Node<V> previous;

    public Node(V element) {
        this.element = element;
        this.next = null;
        this.previous = null;
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

    public Node<V> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<V> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
