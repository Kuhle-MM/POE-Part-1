package st10259861.poe;

import org.junit.Test;
import static org.junit.Assert.*;


public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testCheckUsername() {
        System.out.println("CheckUsername");
        String strUsername = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.CheckUsername(strUsername);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckPassword() {
        System.out.println("CheckPassword");
        String strPassword = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.CheckPassword(strPassword);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        boolean validUsername = true;
        boolean validPassword = true;
        Login instance = new Login();
        String expResult = "Username successfully captured\nPassword successfully captured";
        String result = instance.registerUser(validUsername, validPassword);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testLoginCheck() {
        System.out.println("LoginCheck");
        String strUsername = "kyl_1";
        String strPassword = "Ch&&sec@ke99!";
        String firstName = "Kyle";
        String logUsername = "kyl_1";
        String logPassword = "Ch&&sec@ke99!";
        String surname = "Kop";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.LoginCheck(logUsername,logPassword, firstName, surname,strUsername, strPassword);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Login instance = new Login();
        String expResult = "A unsuccessful login";
        String result = instance.returnLoginStatus();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    //fail tests
    
    
}
