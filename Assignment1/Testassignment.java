package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Testassignment {

    WebDriver driver;

    @BeforeClass

    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @BeforeMethod

    public void navigatetoPage(){

        driver.get("https://the-internet.herokuapp.com/login");

    }

    @AfterMethod
    public void cleancookies(){
        driver.manage().deleteAllCookies();
        System.out.println("Cookies deleted successfully");
    }

    @AfterClass
    public void clossBrowser(){
        driver.quit();
        System.out.println("Test completed");
    }

}



