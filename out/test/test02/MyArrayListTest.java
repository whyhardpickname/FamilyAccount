package test02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author MarkChern
 */
class MyArrayListTest {
    MyArrayList myArrayList = new MyArrayList(3);

    @BeforeEach
    void setUp() {
        myArrayList.add(1);
        myArrayList.add("a");
        myArrayList.add(2);
    }

    @Test
    void size() {
        assertEquals(3, myArrayList.size());
    }

    @Test
    void isEmpty() {
        assertEquals(false, myArrayList.isEmpty());
    }

    @Test
    void indexOf() {
        assertEquals(0, myArrayList.indexOf(1));
        assertEquals(1, myArrayList.indexOf("a"));
        assertEquals(2, myArrayList.indexOf(2));
        assertEquals(-1, myArrayList.indexOf(3));
    }

    @Test
    void lastIndexOf() {
        assertEquals(0, myArrayList.lastIndexOf(1));
    }

    @Test
    void toArray() {
        Object arr[] = {1, "a", 2};
        assertArrayEquals(arr, myArrayList.toArray());
    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void add() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void clear() {
    }
}