package test02;

import java.util.Arrays;

/**
 * @author MarkChern
 * 动态数组
 *  增 add(Object o) add(int index, Object o)
 *  删 remove(int index), remove(Object o)
 *  改 set(int index, Object o)
 *  查 indexOf(Object o) size() isEmpty()
 *  取 get(int index) toArray()
 */
public class MyArrayList {
    /**
     * 数组元素的个数
     */
    private int size;

    /**
     * 储存元素的数组
     */
    private Object[] elementData;

    /**
     * 默认的数组初始容量
     */
    private static final int defaultCapacity = 10;

    /**
     * 默认数组容量的空数组实例
     */
    private static final Object[] defaultCapacityEmptyElementData = {};

    /**
     * 默认的空数组实例
     */
    private static final Object[] defaultEmptyElementData = {};

    /**
     * 创建指定初始容量的数组
     *
     * @param initialCapacity 初始容量
     * @throws IllegalArgumentException 初始容量为负时抛出的异常
     */
    public MyArrayList(int initialCapacity) {
        //先判断是否大于0，是，用指定容量初始化
        //不是。判断是否等于0，是，用默认空数组初始化
        //再不是，说明指定容量数字非法，抛出异常
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = defaultEmptyElementData;
        } else {
            throw new IllegalArgumentException("illegal capacity: " +
                    initialCapacity);
        }
    }

    /**
     * 创建具有默认初始数组容量的数组
     */
    public MyArrayList() {
        this.elementData = defaultCapacityEmptyElementData;
    }

    /**
     * 扩容到指定大小。
     *
     * @param minCapacity 指定的容量
     */
    public void ensureCapacity(int minCapacity) {
        //如果是指定默认的数组，那么容量就是指定的容量。
        int minExpand = (elementData != defaultEmptyElementData)
                ? 0 : defaultCapacity;

        if (minCapacity > minExpand)
            ensureExplicitCapacity(minCapacity);
    }

    private void ensureCapacityInternal(int minCapacity) {
        if (elementData == defaultEmptyElementData)
            minCapacity = Math.max(minCapacity, defaultCapacity);

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        if (minCapacity > elementData.length)
            grow(minCapacity);
    }

    /**
     * 数组最大容量
     */
    private static final int maxArraySize = Integer.MAX_VALUE - 8;

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        if (newCapacity - maxArraySize > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private int hugeCapacity(int minCapacity) {
        if (minCapacity < 0)
            throw new OutOfMemoryError();
        return (minCapacity > maxArraySize) ?
                Integer.MAX_VALUE :
                maxArraySize;
    }

    /**
     * 获取元素个数
     *
     * @return 元素个数
     */
    public int size() {
        return size;
    }

    /**
     * 返回true当数组为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 返回第一个指定元素出现时的下标，如果不存在，返回-1.
     *
     * @param o 指定元素
     * @return 下标或-1
     */
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    /**
     * 返回最后一个指定元素出现时的下标，如果不存在，返回-1.
     *
     * @param o 指定元素
     * @return 下标或-1
     */
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--)
                if (elementData == null)
                    return i;
        } else {
            for (int i = size - 1; i >= 0; i--)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    /**
     * @return 返回恰好容纳所有元素的数组
     */
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    /**
     * 获取指定下标的元素
     *
     * @param index 指定下标
     * @return 元素
     */
    public Object get(int index) {
        rangeCheck(index);

        return elementData[index];
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "index: " + index + ", size: " + size;
    }


    private void rangeCheckForAdd(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     * 修改指定下标的元素为指定对象。
     *
     * @param index   指定下标
     * @param element 指定对象
     * @return 指定下标未修改前的元素
     */
    public Object set(int index, Object element) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    /**
     * 在列表末尾添加一个元素
     *
     * @param e 要添加的元素
     * @return 添加成功返回true。
     */
    public boolean add(Object e) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        return true;
    }

    /**
     * 在列表的指定位置插入指定元素。指定位置的元素及其之后的元素需要依次后移一位。
     *
     * @param index   指定位置
     * @param element 指定元素
     */
    public void add(int index, Object element) {
        rangeCheckForAdd(index);
        ensureCapacityInternal(size + 1);
        System.arraycopy(elementData, index, element, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    /**
     * 移除列表指定位置的元素, 指定下标之后的所有元素依次前移一位。
     *
     * @param index 指定下标
     * @return 被移除元素
     */
    public Object remove(int index) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;//让垃圾回收器回收空间
        return oldValue;
    }

    /**
     * 移除列表指定对象
     *
     * @param o 指定对象
     * @return true，如果存在指定对象并移除成功
     */
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    fastMove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    fastMove(i);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 移除指定下标元素，不做下标检查和返回被移除元素。
     *
     * @param i 下标
     */
    private void fastMove(int i) {
        int numMoved = size - i - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, i + 1, elementData, i,
                    size - i - 1);
        elementData[--size] = null;
    }

    /**
     * 移除所有元素
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }


}