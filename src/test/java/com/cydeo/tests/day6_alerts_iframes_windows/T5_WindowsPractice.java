package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class T5_WindowsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        //Create a new test and make sets up
        driver= WebDriverFactory.getDriver("chrome");
        //Go to "https://practice.cydeo.com/windows"
        driver.get("https://practice.cydeo.com/windows");
    }
    @Test
    public void multiple_window_task(){
        //String the main page's window handle as string is good practice for future reusable purposes
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //Assert Title is "Windows"
        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title before click:"+actualTitle);
        //Click to "Click here" link
        WebElement clickHereLink= driver.findElement(By.linkText("Click here"));
        clickHereLink.click();
        //Switch to new window
        Set<String> allWindowHandles=driver.getWindowHandles();
        for(String each: driver.getWindowHandles()){
            //window handle 1:main window
            //window handle 2:second window
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows" + driver.getTitle());
        }
        //Assert title is new window
        String expectedTitleafterClick="New Window";
        actualTitle=driver.getTitle();
        System.out.println("Title after click " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitleafterClick);
        System.out.println("Title after click"+ actualTitle);
        //If we want to go back to main page, we can already store mainhandle driver.swithcTo().
        // window(mainhandle )



    }
}