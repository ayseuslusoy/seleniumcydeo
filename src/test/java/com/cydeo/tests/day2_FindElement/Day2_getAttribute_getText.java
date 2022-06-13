package com.cydeo.tests.day2_FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_getAttribute_getText {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //navigate to https://google.com
        driver.get("https://google.com");
        //COOKIES ENGELLE
        WebElement agreeButton=driver.findElement(By.id("L2AGLb"));
        agreeButton.click();
        //identify(findElement) and save(WebElement) the search box element and enter(sendKeys)
        // selenium
        WebElement searchbox=driver.findElement(By.name("q"));
        searchbox.sendKeys("selenium");
        //Get tag name of the element
        System.out.println("searchbox.getTagName() = " + searchbox.getTagName());
        //Get value attribute of the element
        //searchbox.getAttribute("value").soutv yazdigimda ve enter otomatik println seklinde gorunur
        System.out.println("searchbox.getAttribute(\"value\") = " + searchbox.getAttribute("value"));

   //identify and save the search button element
       WebElement searchButton=driver.findElement(By.name("btnK"));
       //Get tag name of the element, get, class attribute
        System.out.println("searchButton.getTagName() = " + searchButton.getTagName());
        System.out.println("searchButton.getAttribute(\"class\") = " + searchButton.getAttribute("class"));
         //Click on the search button
        searchButton.submit();
        //Identify the element that hold search result number
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        //get the text of that element
        System.out.println("searchResult.getText() = " + searchResult.getText());

    }
}