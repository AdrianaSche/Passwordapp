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
    public static boolean containsCapital(String password) {

    }

}
