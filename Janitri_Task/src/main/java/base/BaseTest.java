package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

   protected WebDriver driver;

   @BeforeClass
    public void notificationSetup() {

       ChromeOptions options = new ChromeOptions();

       Map<String, Object> prefs = new HashMap<>();
       prefs.put("profile.default_content_setting_values.notifications", 1);


       options.setExperimentalOption("prefs", prefs);

       driver = new ChromeDriver(options);

   }

   @BeforeMethod

    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://dev-dash.janitri.in/");

    }

    @AfterMethod
    public void signOff(){

       System.out.println("Test completed");

        }

        @AfterClass
            public void tearDown() {
                if (driver != null) {
                    driver.quit();
        }
    }
}

