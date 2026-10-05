package Lesson10;

public class Student {
    private String fullname;
    private int studentId;

    public Student (String fullname, int studentId) {
        this.fullname = fullname;
        this.studentId = studentId;
    }

    public String getFullname() {
        return fullname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
