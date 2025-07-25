package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginnull extends Testassignment  {
    @Test(priority = 3)
    public void loginNullInput(){

        driver.findElement(By.id("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
        WebElement message = driver.findElement(By.cssSelector("div#flash.flash.error"));
        Assert.assertTrue(message.isDisplayed());
        System.out.println("Nullinput result:" + message.getText());
    }
}
