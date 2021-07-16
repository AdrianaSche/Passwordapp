public class PasswordApp {
    public static void main(String[] args) {
        String[] list = {"1234DDGnnn", "123", "1234DDGnnn", "1234DDGnnn"};
        validatePasswordArray(list);
    }

    public static boolean validatePassword(String password) {
        if (password == null) {
            System.out.println("Nullpointer-Fehler");
            return false;
        }
        return checkLength(password) && passwordChecker(password);
    }

    public static boolean validatePasswordArray(String[] list) {
        boolean passwordsValid = true;
        for (int i = 0; i < list.length; i++) {
            passwordsValid = validatePassword(list[i]);
            if (passwordsValid == false) {
                System.out.println("Ungueltiges Passwort!");
                break;
            }
        }
        System.out.println("Alle Passwoerter");
        return passwordsValid;
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
        return isDigit && isUpper && isLower && (!isWhitespace);
    }
}