package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Loginvalid extends Testassignment {
    @Test(priority = 1)
    public void loginValidInput(){

            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
            WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
            loginButton.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
            System.out.println("Validinput");
    }
}
