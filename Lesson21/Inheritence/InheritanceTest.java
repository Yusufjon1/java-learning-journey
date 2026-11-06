package Lesson21.Inheritence;

public class InheritanceTest {
    static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        employee = new Manager();

        Pair<Employee> employeePair = new Pair<>(employee);
        Pair<Manager> managerPair = new Pair<>(manager);


    }
}

class Pair<E> {
    private final E e;

    Pair(E e) {
        this.e = e;
    }
}
