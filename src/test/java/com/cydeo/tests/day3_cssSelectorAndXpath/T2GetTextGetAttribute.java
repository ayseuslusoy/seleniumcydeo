package com.cydeo.tests.day3_cssSelectorAndXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2GetTextGetAttribute {
    public static void main(String[] args) {
        //open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //go to  https://login1.nextbasescrm.com/
        driver.get(" https://login1.nextbasescrm.com/");
        //verify "remember me" label as is expected. Expected:remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String actual=rememberMeLabel.getText();
        String expected="remember me on this computer";
        if(actual.equalsIgnoreCase(expected)){
            System.out.println("label verification passed");
        }else{
            System.out.println("label verification failed");
        }
        //Verify forgot password link text is expected. Expected "forgot your password"
        WebElement passwordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualPasswordLink=passwordLink.getText();
        String expectedpasswordLink="forgot your password";
        if(actualPasswordLink.equalsIgnoreCase(expectedpasswordLink)){
            System.out.println("forgot password link passed");
        }else{
            System.out.println("forgot password link failed");
        }
        //verify forgot password href attribute's value contains expected.Expected: forgot-password=yes
        String expectedHref="forgot-password=yes";
        String actualHref=passwordLink.getAttribute("href");
        System.out.println("actualHref = " + actualHref);
        if(actualHref.contains(expectedHref)){
            System.out.println("href attribute value verification passed");
        }else{
            System.out.println("href attribute value verification failed");
        }

    }
}
