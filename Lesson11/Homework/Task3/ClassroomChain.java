package Homework.Task3;

import java.util.Scanner;

public class ClassroomChain {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the room number: ");
        classroom.setRoomNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("The name of the teacher: ");
        classroom.setTeacherName(scanner.nextLine());

        System.out.print("Enter the teacher's phone number: ");
        classroom.setTeacherPhoneNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter student names (separated by comma): ");
        classroom.setStudentNames(scanner.nextLine().split(","));

        classroom.setStudentCount(classroom.getStudentNames().length);

        classroom.display();
    }
}
