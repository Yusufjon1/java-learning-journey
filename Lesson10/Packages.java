package Lesson10;


import java.util.Date;
// import java.sql.Date; // when we import two packages then we need to fully qualified name the classes
import java.util.*; // if we use * for the packages that means we use the whole things inside this package
import static java.lang.Math.*; // if we use the package we don't have to use the keywords of this package in the class

public class Packages {
    public static void main(String[] args) {
       // java.util.Date date = new java.util.Date();  // fully qualified name
       // java.sql.Date sqlDate = new java.sql.Date();

        Date date = new Date();
        System.out.println(date);

        System.out.println(sqrt(16));
        System.out.println(pow(12, 2));
        System.out.println(PI);

    }
}
