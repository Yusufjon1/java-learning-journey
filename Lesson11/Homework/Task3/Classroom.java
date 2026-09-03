package Homework.Task3;

public class Classroom {
    private int roomNumber;
    private String teacherName;
    private int teacherPhoneNumber;
    private String[] studentNames;
    private int studentCount;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public void setTeacherPhoneNumber(int teacherPhoneNumber) {
        this.teacherPhoneNumber = teacherPhoneNumber;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void display() {
        System.out.printf("""
                ROOM NUMBER: %d
                TEACHER NAME: %s
                TEACHER PHONE NUMBER: %d
                NAME OF STUDENTS: %s
                NUMBER OF STUDENTS: %d
                """, roomNumber, teacherName, teacherPhoneNumber, String.join(", ", studentNames), studentCount);
    }
}
