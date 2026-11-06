package Lesson20.CatchingExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class MultipleExceptionHandling {
    static void main(String[] args) {
        try {
            m1();
            m2();
            m3();


     /*   } catch (FileNotFoundException | UnknownHostException e) {
            throw new RuntimeException(e);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);*/

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void m1() throws FileNotFoundException {

    }

      private static void m2() throws IOException {

    }

      private static void m3() throws UnknownHostException {

    }



}
