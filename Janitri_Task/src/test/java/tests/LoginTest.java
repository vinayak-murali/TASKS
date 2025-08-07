package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginButtonDisabledWhenFieldAreEmpty() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("");
        login.enterPassword("");
        login.clickEyeIcon();
        login.clickLoginButton();
        assertFalse(login.isLoginButtonEnabled(), "Login button should be disabled when fields are empty");

    }

    @Test
    public void testPasswordMaskedbutton() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("username");
        login.enterPassword("password123");

        assertTrue(login.isPasswordMasked());
        login.togglePasswordVisibility();
        Thread.sleep(2000);
        assertFalse(login.isPasswordMasked());

        login.togglePasswordVisibility();
        assertTrue(login.isPasswordMasked());
    }

    @Test
    public void testInvalidLoginShowErrorMsg() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("username");
        login.enterPassword("password123");
        login.clickLoginButton();

        String error = login.getErrorMessage();
        System.out.println("Error message: " + error);

        
    }

    @Test
    public void testLoginPageElementsPresence() {
        LoginPage login = new LoginPage(driver);
        assertFalse(login.areLoginElementsPresent());
    }
}