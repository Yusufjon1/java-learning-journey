package Lesson18.builderDP;

public class Main {
   public static void main(String[] args) {
      /*  Employee employee = new Employee();
        Employee employee2 = new Employee("7",
                "Mrom",
                "Mromonov",
                "ranaldo",
                24,
                "email@gmail.com",
                "+098546",
                "gazavik");

        Employee employee3 = new Employee("Mrom", "Mrom");
        Employee employee4 = new Employee("Mrom", "Mrom's father");*/

        Employee employee = Employee.builder()
                .id("787 ")
                .firstName("John")
                .build();
        System.out.println(employee);
    }


}
