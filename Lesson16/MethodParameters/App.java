package Lesson16.MethodParameters;

public class App {
    static void main(String[] args) {
        App app = new App();
        int a = 7;
        // app.m1(a);
        // System.out.println(a);
       // Integer b = 12;
       // app.m2(b);
       // System.out.println(b);

        Counter c = new Counter();
        c.count = 90;
        System.out.println(c.count);
        app.m3(c);
        System.out.println(c.count);
    }

    public void m3(Counter c) {
       // c.count = 300;
        c = new Counter();
        c.count = 12;
    }

    public void m1(int a) {
        a = 90;
        System.out.println("inside m1 method " + a);
    }

    public void m2(Integer b) {
        b = 90;
    }
}
