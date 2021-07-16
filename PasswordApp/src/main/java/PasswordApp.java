public class PasswordApp {
    public static void main(String[] args) {

    }

    public static boolean validatePassword(String password) {
        if (password == null) {
            System.out.println("Nullpointer-Fehler");
            return false;
        }

        return checkLength(password) && containsUpperCase(password) && containsLowerCase(password) && containsDigit(password) && !(containsWhitespace(password));
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
    }

}
