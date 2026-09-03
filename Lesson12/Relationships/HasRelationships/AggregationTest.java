package Relationships.HasRelationships;

public class AggregationTest {
    public static void main(String[] args) {
        Address address = new Address("Uzbekistan", "Tashkent", "olmazor");
        Student student = new Student("Mrom mromonov", 24, address);
        System.out.println(student);

    }
}
