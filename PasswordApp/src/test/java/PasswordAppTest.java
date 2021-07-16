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
    public void checkWithValidPassword(){
        //given
        String password = "1234GGGHHHaaannn";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertTrue(actual);
    }


    @Test
    public void checkWithWhitespace(){
        //given
        String password = "1234GGGHHH aaannn";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkWithoutUpper(){
        //given
        String password = "1234aaannn";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }
    @Test
    public void checkWithoutLower(){
        //given
        String password = "1234GGGHHH";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkWithoutDigit(){
        //given
        String password = "GGGHHHaaannn";
        //when
        boolean actual = PasswordApp.validatePassword(password);
        //then
        assertFalse(actual);
    }

    //check passwordChecker
    @Test
    public void checkWithoutDigitChecker(){
        //given
        String password = "GGGHHHaaannn";
        //when
        boolean actual = PasswordApp.passwordChecker(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkWithoutUpperChecker(){
        //given
        String password = "aaannn237777";
        //when
        boolean actual = PasswordApp.passwordChecker(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkWithoutLowerChecker(){
        //given
        String password = "GGGHHH12345";
        //when
        boolean actual = PasswordApp.passwordChecker(password);
        //then
        assertFalse(actual);
    }

    @Test
    public void checkWithWhitespaceChecker(){
        //given
        String password = "GGGHHH 111aaannn";
        //when
        boolean actual = PasswordApp.passwordChecker(password);
        //then
        assertFalse(actual);
    }



}
