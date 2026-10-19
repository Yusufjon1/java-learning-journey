package Lesson19.TodoProject.Backend.enumsAndDomain;

public class Todo {
    private String id;
    private String title;
    private Priority priority = Priority.LOW;  // LOW, MEDIUM, HIGH
    private Category category = Category.DEFAULT;  // WORK, STUDY, ENTERTAINMENT, DEFAULT;
    private boolean completed;

    public Todo() {
    }

    public Todo(String id, String title, Priority priority, Category category, boolean completed) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.category = category;
        this.completed = completed;
    }

    public static TodoBuilder builder() {
        return new TodoBuilder();
    }


    public static class TodoBuilder {
        private String id;

        private String title;

        private Priority priority = Priority.LOW;

        private Category category = Category.DEFAULT;

        private boolean completed;

        public TodoBuilder Id(String id) {
            this.id = id;
            return this;
        }

        public TodoBuilder Title(String title) {
            this.title = title;
            return this;
        }

        public TodoBuilder Priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TodoBuilder Category(Category category) {
            this.category = category;
            return this;
        }

        public TodoBuilder Completed(boolean completed) {
            this.completed = completed;
            return this;
        }

        public Todo build() {
            return new Todo(this.id, this.title, this.priority, this.category, this.completed);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        String status = completed ? "✅ [DONE]" : "\uD83D\uDD32 [NEW]";
        return " TODO ID:  %s, CATEGORY: %s | PRIORITY: %s, TITLE: %s | ".formatted(id, category.getEmoji(), priority.getPriority(), title);
    }
}
