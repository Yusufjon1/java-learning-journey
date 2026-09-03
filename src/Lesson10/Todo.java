package Lesson10;

public class Todo {
    public String title;
    public int day;
    public boolean isCompleted;
    public boolean isDeleted;

    public void done() {
        isCompleted = true;
    }

    public void deleted() {
        isDeleted = true;
    }

    public void display() {
        System.out.printf("Title : %s | Day : %d | Completed : %b%n", title, day, isCompleted);
    }
}
