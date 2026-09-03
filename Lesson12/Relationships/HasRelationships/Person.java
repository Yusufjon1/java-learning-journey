package Relationships.HasRelationships;

public class Person {

    private String name;

    public Person(String name, Heart heart) {
        this.name = name;
        this.heart = heart;
    }

    private final Heart heart;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                '}';
    }
}
