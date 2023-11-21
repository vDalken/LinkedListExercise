public class Node<T> {
    T value;
    Node<T> next; // Reference to the next node

    public Node(T value) {
        this.value = value;
        this.next=null;
    }
}
