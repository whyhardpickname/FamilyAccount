package singleLinkedList;

import org.junit.jupiter.api.Test;

/**
 * @author MarkChern
 */
public class SingleLinkedListTest {

    @Test
    public void addTest() {
        SingleLinkedList list = new SingleLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.getSize());
    }
}
