package Lesson19.TodoProject.Backend.enumsAndDomain;

public enum Priority {
    LOW("LOW ⚪"),

    MEDIUM(" MEDIUM 🔵"),

    HIGH("HIGH 🔴");

    private final String priority;

    Priority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

}
