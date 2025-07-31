package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginStepDefinitions {
    static WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid(String username,String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @And("click on login button")
    public void click_on_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
    }
    @Then("user should receive a message")
    public void user_should_receive_a_message() {
        Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
    }
    @And("close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
