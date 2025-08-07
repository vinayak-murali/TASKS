package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private WebDriver driver;

    private By usernameInput = By.id("formEmail");
    private By passwordInput = By.id("formPassword");
    private By eyeIcon = By.xpath("/html/body/div/div/div/div[2]/div/div/form/div[2]/img");
    private By loginButton = By.xpath("//button[@class='login-button']");
    private By errorMessage = By.cssSelector("p.normal-text");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);

    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickEyeIcon() {
        driver.findElement(eyeIcon).click();
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isPasswordMasked() {
        String type = driver.findElement(passwordInput).getAttribute("type");
        return type.equals("password");
    }

    public void togglePasswordVisibility() {
        driver.findElement(eyeIcon).click();
    }

    public String getErrorMessage() {
      return driver.findElement(errorMessage).getText();
    }
    public boolean areLoginElementsPresent() {
        return false ;
    }
}