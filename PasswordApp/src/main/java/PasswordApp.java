public class PasswordApp {
    public static void main(String[] args) {

       // validatePassword("")

    }

    public static boolean validatePassword(String password) {
        if (password == null) {
            System.out.println("Nullpointer-Fehler");
            return false;
        }
        boolean test1= checkLength(password);
        boolean test2 = passwordChecker(password);
        boolean test = checkLength(password) && passwordChecker(password);
        return test;

    }

    public static boolean checkLength(String password) {
        int passwordLength = password.length();
        if (passwordLength < 7) {
            System.out.println("Passwort zu kurz");
            return false;
        } else if (passwordLength > 20) {
            System.out.println("Passwort ist zu lang");
            return false;
        }

        return true;
    }

    public static boolean passwordChecker(String password) {
        char chr;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isWhitespace = false;

        for (int i = 0; i < password.length(); i++) {
            chr = password.charAt(i);
            if (Character.isUpperCase(chr)) {
                isUpper = true;
                continue;
            } else if (Character.isLowerCase(chr)) {
                isLower = true;
                continue;
            } else if (Character.isDigit(chr)) {
                isDigit = true;
                continue;
            } else if (Character.isWhitespace(chr)) {
                isWhitespace = true;
                continue;
            }
        }
        return isDigit&&isUpper&& isLower && (!isWhitespace);
    }
    /*
    public static boolean containsUpperCase(String password) {
        boolean hasUpper = false;
        for (int i =0; i<password.length();i++){
            if (Character.isUpperCase(password.charAt(i))){
                 hasUpper = true;
                return  hasUpper;
            }
        }
        return  hasUpper;
    }

    public static boolean containsLowerCase(String password) {
        boolean hasLower = false;
        for (int i =0; i<password.length();i++){
            if (Character.isLowerCase(password.charAt(i))){
                hasLower = true;
                return  hasLower;
            }
        }
        return  hasLower;
    }
    public static boolean containsDigit(String password) {
        boolean hasDigit = false;
        for (int i =0; i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                hasDigit = true;
                return  hasDigit;
            }
        }
        return  hasDigit;
    }

    public static boolean containsWhitespace(String password) {
        boolean hasWhitespace = false;
        for (int i =0; i<password.length();i++){
            if (Character.isWhitespace(password.charAt(i))){
                hasWhitespace = true;
                 return  hasWhitespace;
            }
        }
        return  hasWhitespace;
    }*/


}
