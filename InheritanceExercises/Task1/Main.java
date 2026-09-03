package Task1;

public class Main {
    public static void main(String[] args) {
        Iphone17pro iphone17pro = new Iphone17pro();
        iphone17pro.call();

        Iphone iphone = new Iphone("Iphone");
        iphone.call();

        Samsung samsung = new Samsung("Samsung");
        samsung.call();

        Redmi redmi = new Redmi("redmi");
        redmi.call();

        Iphone17 iphone17 = new Iphone17("iphone 17");
        iphone17.call();

    }
}
