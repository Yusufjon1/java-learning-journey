package Relationships.HasRelationships;

public class AssociationTest {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("Yusuf Zuhriddinov");
        Passport passport = new Passport("AB", "1234567");
        String data = "Citizen FullName : %s, Identity Card DATA : %s%s "
                .formatted(citizen.getFullName(), passport.getSerial(), passport.getNumber());
        System.out.println(data);
    }
}
