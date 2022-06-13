package com.cydeo.tests.day11_actions_jsexecutor_practice;
import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC7_Scroll_JSExecutor {
    @Test
    public void task7_scroll_test(){
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get(" https://practice.cydeo.com/large");

        //Down-casting our driver type to JavascriptExecutor,
        // so we are able to use the methods coming from that interface
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Scroll down to Cydeo Link
        BrowserUtilities.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        //4- Scroll up to “Home” link
        BrowserUtilities.sleep(2);
        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

        //objects
        //cydeoLink 0
        //homeLink 1
        //someOtherLink 2

        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)



    }
}
