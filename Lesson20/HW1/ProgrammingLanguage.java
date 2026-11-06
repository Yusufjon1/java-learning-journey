package Lesson20.HW1;

public class ProgrammingLanguage {
    private String name;
    private String owner;
    private String releaseDate;

    public ProgrammingLanguage(String name, String owner, String releaseDate) {
        this.name = name;
        this.owner = owner;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
