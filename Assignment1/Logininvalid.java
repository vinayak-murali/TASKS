package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logininvalid extends Testassignment  {
    @Test(priority = 2)
    public void loginInvalidInput(){

            driver.findElement(By.id("username")).sendKeys("wrongusername");
            driver.findElement(By.name("password")).sendKeys("wrongpassword!");
            WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
            loginButton.click();
            WebElement message = driver.findElement(By.cssSelector("div#flash.flash.error"));
            Assert.assertTrue(message.isDisplayed());
            System.out.println("Invalid input result:" + message.getText());
    }
}

