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

    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node iterator = head;
        for (int i = 0; i < size; i++) {
            //使用while最后一个数据会缺失
            arr[i] = iterator.data;
            iterator = iterator.next;
        }
        return arr;
    }

    /**
     * 删除保存指定对象的第一个的节点。
     * 如果不存在，返回false。
     * @param o 指定对象
     * @return true如果节点存在且被成功删除。
     */
    public boolean remove(Object o) {
        Node last = null;
        Node current = head;

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (current.data == null) {
                    //删除第一个结点
                    if (current == head) {
                        head = head.next;
                    } else {
                        last.next = current.next;
                    }
                    size--;
                    return true;
                } else {
                    last = current;
                    current = current.next;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(current.data)) {
                    //删除第一个结点
                    if (current == head) {
                        head = head.next;
                    } else {
                        last.next = current.next;
                    }
                    size--;
                    return true;
                } else {
                    last = current;
                    current = current.next;
                }
            }
        }
        return false;
    }

    /**
     * 返回指定对象在列表在对应数组的下标。如果没有，返回-1.
     * @param o 指定对象
     * @return 下标或-1
     */
    public int indexOf(Object o) {
        Node current = head;

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (current.data == null)
                    return i;
                else
                    current = current.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(current.data))
                    return i;
                 else
                    current = current.next;

            }
        }
        return -1;
    }
}
