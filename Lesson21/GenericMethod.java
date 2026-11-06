package Lesson21;

public class GenericMethod {
    public static <T extends Comparable<T>> int compare(T obj1, T obj2) {
        return obj1.compareTo(obj2);
    }

}

record Employee  (String fullname, int age) implements Comparable<Employee> {

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.age, employee.age);             // this.age.compareTo(employee.age);
    }
}

class GenericMethodTest{
    static void main(String[] args) {
       int compare =  GenericMethod.compare(12, 12);
        System.out.println(compare);
        int compare1 = GenericMethod.compare("helo", "hi");
        System.out.println(compare1);
        var employee1 = new Employee("mrom", 24);
        var employee2 = new Employee("mromulla", 25);
        int compare3 = GenericMethod.compare(employee1, employee2);
        System.out.println(compare3);

    }
}
