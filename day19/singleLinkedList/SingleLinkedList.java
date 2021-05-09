package singleLinkedList;
/**
@author MarkChern
*/
public class SingleLinkedList {
    private Node head;
    private int size;

    private static class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add(Object o) {
        if (head == null) {
            head = new Node(o, null);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(o, null);
        }
        size++;
    }

    public int getSize() {
        return size;
    }
}
