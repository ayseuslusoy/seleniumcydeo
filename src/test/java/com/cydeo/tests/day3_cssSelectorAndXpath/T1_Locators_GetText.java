package com.cydeo.tests.day3_cssSelectorAndXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_GetText {
    public static void main(String[] args) {
        //set up chrome and create web driver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //navigate to https://login1.nextbasescrm.com/
        driver.get(" https://login1.nextbasecrm.com/");
        //Enter incorrect username "incorrect" (Enter icin sendKeys method kullanilmali)
        WebElement userName= driver.findElement(By.className("login-inp"));
        userName.sendKeys("incorrect");// WebElement userName webelementi save yapmak
        // icin kullanilir. Eger ben save yapmak istemezsem iki bilgiyi su sekilde birlestirebilirim:
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");

        //Enter incorrect password "password"
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");
        //Click to login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
        //Verify error message text is as expected. Expected:Incorrect login or password
        WebElement error= driver.findElement(By.className("errortext"));
        String actual=error.getText();
        String expected="Incorrect login or password";
        if(actual.equals(expected)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

    }
}
