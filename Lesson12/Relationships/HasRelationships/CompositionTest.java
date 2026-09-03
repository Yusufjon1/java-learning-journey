package Relationships.HasRelationships;

public class CompositionTest {
    public static void main(String[] args) {
        Heart heart = new Heart(77);
        Person person = new Person("Mrom", heart);
        System.out.println(person);
    }
}
