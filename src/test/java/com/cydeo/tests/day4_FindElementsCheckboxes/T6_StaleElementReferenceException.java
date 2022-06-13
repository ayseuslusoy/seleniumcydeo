package com.cydeo.tests.day4_FindElementsCheckboxes;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class T6_StaleElementReferenceException {
    public static void main(String[] args) {
        //open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Go to https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //Locate Cydeo Link verify it is displayed
        WebElement cydeoLink=driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        //Refresh the page
        driver.navigate().refresh();
        //We are refreshing the web element reference by re-assigning(re-locating) the web elemnt
        cydeoLink=driver.findElement(By.xpath("//a[text()='CYDEO']"));
        //Verify it is displayed again
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
    }
}
