package singleLinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author MarkChern
 */
class SingleLinkedListTest {
    SingleLinkedList list = new SingleLinkedList();

    @BeforeEach
    void setUp() {
        list.add("a");
        list.add("b");
        list.add("c");
    }

    @AfterEach
    void tearDown() {
        list = null;
    }

    @Test
    void add() {
        list.add("d");
        assertEquals(4, list.getSize());
    }

    @Test
    void getSize() {
        assertEquals(3, list.getSize());
    }

    @Test
    void toArray() {
        Object[] arr = {"a", "b", "c"};
        assertArrayEquals(arr, list.toArray());
    }

    @Test
    void remove() {
        assertTrue(list.remove("a"));
        assertEquals(2, list.getSize());
        assertArrayEquals(new Object[]{"b", "c"}, list.toArray());

        list.add("d");

        assertTrue(list.remove("c"));
        assertEquals(2, list.getSize());
        assertArrayEquals(new Object[]{"b", "d"}, list.toArray());

        assertNotEquals(true, list.remove("c"));
        assertEquals(2, list.getSize());
        assertArrayEquals(new Object[]{"b", "d"}, list.toArray());
    }

    @Test
    void indexOf() {
        assertEquals(0, list.indexOf("a"));
        assertEquals(2, list.indexOf("c"));
        assertEquals(-1, list.indexOf("d"));
    }
}