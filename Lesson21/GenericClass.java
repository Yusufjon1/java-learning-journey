package Lesson21;


import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class GenericClass<E> {
    private Object[] elementsData;

    public GenericClass() {
        this(3);
    }

    public GenericClass(int capacity) {
        this.elementsData = new Object[capacity];
    }

    public boolean set(int index, E element) {
        Objects.checkIndex(index, elementsData.length);
        elementsData[index] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementsData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementsData);
    }
}

class Student {
    private final String id;
    private final String fullName;

    public Student(String id, String fullName) {
        this.id = id;
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

class GenericClassTest {

    public static void main(String[] args) {
        GenericClass<String> languages = new GenericClass<String>();
        languages.set(0, "python");
        languages.set(1, "java");
        languages.set(2, "scala");
        System.out.println(languages);
        String language = languages.get(1);
        System.out.println(language);

        GenericClass<Student> students = new GenericClass<Student>(4);
        students.set(0, new Student(UUID.randomUUID().toString(), "mrom mromonov"));
        students.set(1, new Student(UUID.randomUUID().toString(), "azam dota zadr"));
        System.out.println(students);
        Student student = students.get(0);
        System.out.println(student);

        GenericClass<Integer> integers = new GenericClass<Integer>();
        integers.set(0, 23412);
        integers.set(1, 23);
        integers.set(2, 412);
        System.out.println(integers);
        Integer integer = integers.get(1);
        System.out.println(integer);

    }


}
