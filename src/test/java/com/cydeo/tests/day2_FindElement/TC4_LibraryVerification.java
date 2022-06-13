package com.cydeo.tests.day2_FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_LibraryVerification {
    public static void main(String[] args) {
        //open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Go to https://library2cybertekschool.com.login.html
        driver.get("http://library2.cybertekschool.com/login.html");

        //Enter username:"incorrect@email.com"
        WebElement username =driver.findElement(By.id("inputEmail"));
        username.sendKeys("incorrect@email.com");
        //Enter password:"incorrect password"
        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");
        //Click to sign in button
        WebElement signIn=driver.findElement(By.tagName("button"));
        signIn.click();

    }
}
