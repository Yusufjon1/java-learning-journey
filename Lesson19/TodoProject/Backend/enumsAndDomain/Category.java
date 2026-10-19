package Lesson19.TodoProject.Backend.enumsAndDomain;

public enum Category {
    WORK(" WORK 🏢"),

    STUDY("STUDY 📚"),

    ENTERTAINMENT(" ENTERTAINMENT 🎮"),

    DEFAULT(" DEFAULT 📌");

    private final String emoji;

    Category(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
