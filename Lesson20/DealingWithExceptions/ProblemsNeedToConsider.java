package Lesson20.DealingWithExceptions;

public class ProblemsNeedToConsider {
    public static void main(String[] args) {
      /*  final Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        System.out.println(nextInt * 2);
        scanner.close(); */

        registerUser(null, "123");
    }



    static boolean registerUser(String username, String password) {
        // jOHn, JOHn, JOHN, john, John => username.toLowerCase
        if (username != null) {
            username = username.toLowerCase();
        }
        // save to database(username, password)
        return true;
    }
}
