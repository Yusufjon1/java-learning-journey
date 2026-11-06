package Lesson20.DealingWithExceptions;

import java.io.FileNotFoundException;

public class ExceptionPropagation2Example {

    public static void m5() throws FileNotFoundException {
        throw new FileNotFoundException("checking Exception propagation ");
    }
}
