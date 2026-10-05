package Lesson14.MultiInheritance;

public interface Teacher {

    default void CommunicateWithStudents() {

    }

    static boolean isNull(Object obj) {
        return obj == null;
    }

    void teach();
}
