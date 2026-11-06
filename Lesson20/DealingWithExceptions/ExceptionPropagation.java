package Lesson20.DealingWithExceptions;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionPropagation {
    static void main(String[] args) {
        // m4();

       try {
           m1();
       } catch (FileNotFoundException e) {
           System.out.println("error ");
           var writer = new StringWriter();
           e.printStackTrace(new PrintWriter(writer));
           String s = writer.toString();
           System.out.println(s);
       }

    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        ExceptionPropagation2Example.m5();
    }
    private static void m4()  {
        throw new RuntimeException("Runtime exception check");
    }
}
