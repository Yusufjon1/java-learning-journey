package Lesson15.WrapperClasses;

public class Util {
    public static boolean isValidNumber(String phoneNumber) {
      /*  for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (ch < 48 || ch > 57)
                return false;
        }
        return true;
    */
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigit(String numberOrDigit) {
        for (int i = 0; i < numberOrDigit.length(); i++) {
            char ch = numberOrDigit.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}


