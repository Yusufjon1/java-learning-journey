package Task2;

public class Student extends Person {

    private String parentNumber;
    private String schoolNumber;
    private Phone studentPhone;

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Phone getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(Phone studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Student(String phone, String name, String password, String parentNumber, Phone studentPhone, String schoolNumber) {
        super(phone, name, password);
        this.parentNumber = parentNumber;
        this.studentPhone = studentPhone;
        this.schoolNumber = schoolNumber;
    }

    public Student(String phone, String name, String password) {
        super(phone, name, password);
    }

    public void call (String number) {
        System.out.println(number + " Calling number ... ");
    }

}
