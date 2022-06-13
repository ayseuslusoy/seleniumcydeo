package com.cydeo.tests.day6_alerts_iframes_windows;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_Alert_Practices {
    WebDriver driver;
    @BeforeMethod
    public void  setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void alertTest1(){
        //Click to "Click for JS Alert" Button
        WebElement infoAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlertButton.click();
        //Click to ok button from the alert(to be able to click to alert ok button, we need to switch
        // driver's focus to Alert itself)
        Alert alert=driver.switchTo().alert();
        alert.accept();//Once we click accept, the alert disappears from the page and our driver refocus html
        //we can't test pop up
        //verify you succesfully clicked an alert text is displayed
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));
        //failure message will only be displayed if assertion fails
        Assert.assertTrue(resultText.isDisplayed(), "result text is not displayed");
        String expectedText="You successfully clicked an alert";
        String actualText=resultText.getText();
        Assert.assertEquals(actualText, expectedText, "actual text is not accepted");
    }

  
}
