package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithNoSelectTag {
    public static void main(String[] args) {
        //1.set up chrome driver and open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2.Navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/dropdown");
        //Click to open "unusual" dropdown without select tag
        WebElement dropdownL=driver.findElement(By.linkText("Dropdown Link"));
        dropdownL.click();
        //Click item(link) with text Google
        WebElement itemGoogle=driver.findElement(By.linkText("Google"));
        itemGoogle.click();
    }
}
