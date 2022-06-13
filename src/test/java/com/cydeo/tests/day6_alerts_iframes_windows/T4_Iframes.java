package com.cydeo.tests.day6_alerts_iframes_windows;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class T4_Iframes {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        //Create a new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //Go to https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }
        @Test
                public void iframe_test() {
        //We need to switch driver's focus to iframe
            // option1 switching to iframe using idattribute value driver.switchTo().frame("mce_0_ifr");
            //option 2 passing index number of iframe driver.switchTo().frame(0)
            //option 3 locate as web element and pass in frame() method
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
            //Locate the p tag
            WebElement yourContentGoesHere=driver.findElement(By.xpath("//p"));
            //Assert "your content goes here" Text is displayed
            Assert.assertTrue(yourContentGoesHere.isDisplayed());
            //Verify "an iframe containing the TinyMCE WYSIWYG Editor" To be able to verify the header,
            //we must switch back to "main html"
            driver.switchTo().parentFrame();
            WebElement headerText=driver.findElement(By.xpath("//h3"));
            //assertion of the header text is displayed or not
            Assert.assertTrue(headerText.isDisplayed());

        }

    }

