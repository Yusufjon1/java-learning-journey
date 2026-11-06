package Lesson22;

import java.util.Arrays;
import java.util.Objects;

public class DynamicIntegerArray {

    private Integer[] elementData;
    private int size = 0;

    public DynamicIntegerArray(int initialCapacity) {
        this.elementData = new Integer[initialCapacity];
    }

    public DynamicIntegerArray() {
        this(10);
    }

    public boolean add(Integer item) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++] = item;
        return true;
    }

    private void grow() {
        int newCapacity = elementData.length + elementData.length / 2 + 1;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size));
    }

    public Integer get(int index) {
        Objects.checkIndex(index, elementData.length);
        return elementData[index - 1];
    }

    public Integer remove(int index) {
        Objects.checkIndex(index, elementData.length);
        Integer oldValue = elementData[index];
        int newSize;
        if ((newSize = size - 1) > index)
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        elementData[size = newSize] = null;
        return oldValue;
    }

    public boolean removeObject(Integer o) {

        int i = 0;
        found:
        {
            if (o == null) {
                for (; i < size; i++) {
                    if (elementData[i] == null) {
                        break found;
                    }
                }
            } else {
                for (; i < size; i++) {
                    if (o.equals(elementData[i])) {
                        break found;
                    }
                }
            }
            return false;
        }
        remove(i);
        return true;
    }

    static void main(String[] args) {
        DynamicIntegerArray arr = new DynamicIntegerArray(10);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        System.out.println(arr);
        System.out.println(arr.removeObject(14));
        System.out.println(arr);


    }
}
