package Lesson22;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

public class DynamicGenericArray<E> implements Iterable<E> {

    private Object[] elementData;
    private int size = 0;

    public DynamicGenericArray(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public DynamicGenericArray() {
        this(10);
    }

    public boolean add(E item) {
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

    @SuppressWarnings("unchecked")
    public E get(int index) {
        Objects.checkIndex(index, elementData.length);
        return (E) elementData[index - 1];
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        Objects.checkIndex(index, elementData.length);
        Object oldValue = elementData[index];
        int newSize;
        if ((newSize = size - 1) > index)
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        elementData[size = newSize] = null;
        return (E) oldValue;
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

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) Arrays.stream(Arrays.copyOf(elementData, size)).iterator();

    }

    static void main(String[] args) {
        DynamicGenericArray<String> languages = new DynamicGenericArray<>(5);
        languages.add("python");
        languages.add("java");
        languages.add("scala");
        languages.add("C#");
        System.out.println(languages);
        DynamicGenericArray<Student> student = new DynamicGenericArray<>();
        student.add(new Student("blabla"));
        student.add(new Student("hello world"));
        System.out.println(student);
        for (String language : languages) {
            System.out.println(language);
        }

        for (Student student1 : student) {
            System.out.println(student1);
        }


    }
}

class Student {
    private final String id;
    private final String fullName;

    Student(String fullName) {
        this.id = UUID.randomUUID().toString();
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
