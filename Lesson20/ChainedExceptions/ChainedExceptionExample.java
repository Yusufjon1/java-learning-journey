package Lesson20.ChainedExceptions;

import java.sql.SQLException;
import java.util.Random;

public class ChainedExceptionExample {
    static void main(String[] args) {
        registerUser("user");
    }


        static void registerUser(Object user) { // <- username, email, password

            try {
                sendEmail(user);
                sendDB(user);
            } catch (Exception e) {
               APIException exception = new APIException(e.getMessage());
               exception.initCause(e);
               throw exception;
            }
            // save to DB and send email to that user
        }

        private static void sendEmail(Object user) throws Exception {
            System.out.println(new Random().nextBoolean());
            throw new Exception("Could not connect to smtp server");
        }

        private static void sendDB(Object user) throws SQLException {
            if (new Random().nextBoolean()) {
                throw new SQLException("Could not connect to database");
            }

        }
    }
     class APIException extends RuntimeException {
         public APIException(String message) {
             super(message);
         }
     }



