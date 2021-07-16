import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordAppTest {

    @Test
    public void checkInputNull() {
        //given
        String password = null;
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkInputEmpty() {
        //given
        String password = "";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkInputToShort() {
        //given
        String password = "banane";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkInputToLong() {
        //given
        String password = "bananebananebananebananebananebananebananebananebanane";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkInputLengthIsValide() {
        //given
        String password = "bananebanane";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertTrue(actual);
    }

    @Test
    public void checkInputHasUpper() {
        //given
        String password = "bAnAnEbAnAnE";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertTrue(actual);
    }

    @Test
    public void checkInputHasLower() {
        //given
        String password = "bananebanane";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertTrue(actual);
    }

    @Test
    public void checkInputHasNumber() {
        //given
        String password = "bananebanane";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertTrue(actual);
    }

    @Test
    public void checkInputBlank() {
        //given
        String password = "banane banane";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }
}
