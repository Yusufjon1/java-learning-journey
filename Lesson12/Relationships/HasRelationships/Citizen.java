package Relationships.HasRelationships;

public class Citizen {

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Citizen(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

}
