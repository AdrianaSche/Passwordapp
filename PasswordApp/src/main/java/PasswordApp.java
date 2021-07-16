public class PasswordApp {
    public static void main(String[] args) {

    }

    public static boolean validatePassword(String password) {
        if (password == null) {
            System.out.println("Nullpointer-Fehler");
            return false;
        }
        boolean lengthOK = checkLength(password);

        return lengthOK;
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
        boolean isUpper = false;
        for (int i =0; i<password.length();i++){
            if (Character.isUpperCase(password.charAt(i))){
                isUpper = true;
                return  isUpper;
            }
        }
        return  isUpper;
    }

    public static boolean containsLowerCase(String password) {
        boolean isUpper = false;
        for (int i =0; i<password.length();i++){
            if (Character.isLowerCase(password.charAt(i))){
                isUpper = true;
                return  isUpper;
            }
        }
        return  isUpper;
    }
    public static boolean containsDigit(String password) {
        boolean isUpper = false;
        for (int i =0; i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                isUpper = true;
                return  isUpper;
            }
        }
        return  isUpper;
    }

    public static boolean containsWhitespace(String password) {
        boolean isUpper = true;
        for (int i =0; i<password.length();i++){
            if (Character.isWhitespace(password.charAt(i))){
                isUpper = false;
                return  isUpper;
            }
        }
        return  isUpper;
    }

}
