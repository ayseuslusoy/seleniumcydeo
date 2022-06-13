package com.cydeo.tests.day3_cssSelectorAndXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocateElementByXPath {
    public static void main(String[] args) {
        //set up chrome and create web driver instance
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //navigate to https://search.yahoo.com
        driver.get("https://search.yahoo.com");
        //use xpath to identify searchbox and enter "x path"
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='p']"));
        searchBox.sendKeys("xpath");
        //click on x icon to clear out the text
        driver.findElement(By.xpath("//button//span[@class='sprite']"));
        //enter "selenium locators" into search box
        searchBox.sendKeys("selenium locators");
        //identify search icon and click on it
        driver.findElement(By.xpath("//span[@title='Search']")).click();
        //close browser
        driver.close();
    }
}
