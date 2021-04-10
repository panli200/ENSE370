import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    @Test
    public void RegisterLogin_FirstAccount_Success(){
        Login login = new Login();

        String email = "joe@uregina.ca";
        String password = "passwordy";
        String firstName = "Joe";
        String lastName = "Wilson";
        int yearOfBirth = 1978;
        int monthOfBirth = 12;
        User user = login.register (email, firstName, lastName, yearOfBirth, 
                            monthOfBirth, password);
        short [] expectedHash = {19101, 14361, 20130, 20130, 21544, 18764, 19784, 15255, 22269, 11576, 16805, 17771, 20130, 18764, 18430, 3729, 3880, 8404, 11576, 15559, 16805, 17771, 18430, 18764, 18764, 20130, 3729, 5021, 4680, 4849, 8404, 18764, 15559};

        assertTrue(user.checkHash(expectedHash));
    }
    
    @Test
    public void RegisterLogin_SecondAccount_Success(){
        Login login = new Login();

        String email = "sam@uregina.ca";
        String password = "car";
        String firstName = "Sam";
        String lastName = "Zu";
        int yearOfBirth = 2001;
        int monthOfBirth = 5;
        User user = login.register (email, firstName, lastName, yearOfBirth, 
                            monthOfBirth, password);
        short [] expectedHash = {14954, 14361, 19784, 12380, 20831, 4351, 10546, 12380, 14361, 18099, 20831, 3880, 3581, 3581, 3729, 10546, 14361, 18099};
        assertTrue(user.checkHash(expectedHash));
    }

    @Test
    public void RegisterLogin_ThirdAccount_Success(){
        Login login = new Login();

        String email = "a@b.c";
        String password = "d";
        String firstName = "e";
        String lastName = "f";
        int yearOfBirth = 2000;
        int monthOfBirth = 1;
        User user = login.register (email, firstName, lastName, yearOfBirth, 
                            monthOfBirth, password);
        short [] expectedHash = {15255, 15866, 3729, 15559, 15866, 3880, 3581, 3581, 3581, 15559};

        assertTrue(user.checkHash(expectedHash));
    }
}