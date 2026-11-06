package Lesson21.HW3;

public class ArrayList<T> {
    private Object[] data;
    private int size;

    public ArrayList() {
        this.data = new Object[10];
        this.size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            grow();
        }
        data[size] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        checkIndex(index);
        T removed = (T) data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;

        return removed;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void grow() {
        Object[] bigger = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            bigger[i] = data[i];
        }
        data = bigger;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("error");
        }
    }
}


