package Task2;

public class Subject {
    private String className;
    private String classNumber;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Subject(String className, String classNumber) {
        this.className = className;
        this.classNumber = classNumber;
    }
}
