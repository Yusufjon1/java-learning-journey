package Task2;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", "64", "black");
        Student s1 = new Student("123", "Vali", "4444", "4455", phone, "243");

        Phone phone1 = new Phone("samsung", "128", "white");
        Student s2 = new Student("123", "ali", "4444", "4445", phone1, "243");

        Phone phone2 = new Phone("redmi", "256", "red");
        Student s3 = new Student("123", "G'ali", "4444", "4555", phone2, "243");

        Student[] students = {s1, s2, s3};

        resetPassword(students, "123", "4444", "5555");
    }

    public static void resetPassword(Student[] students, String targetPhone, String oldPassword, String newPassword) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPhone().equals(targetPhone)) {
                boolean isSuccess = students[i].changePassword(oldPassword, newPassword);
                if (isSuccess) {
                    System.out.println("PIN has been changed");
                } else {
                    System.out.println("Wrong old password!");
                }
                return;
            }
        }
        System.out.println("No student found with this phone number!");
    }

}
