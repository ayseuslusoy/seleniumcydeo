package com.cydeo.tests.day2_FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_GoogleSearch {
    public static void main(String[] args) {
        //Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        ///Go to https://google.com
        driver.get("https://google.com");
        //PREVENT COOKIES
        WebElement agreeButton= driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        //Write "apple" in search box
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);
                //Verify title: expected title should start with apple word
        String expected="apple";
        String actual=driver.getTitle();
        if(actual.startsWith(expected)){
            System.out.println("The test passed");
        }else{
            System.out.println("The test failed");
        }
    }
}
