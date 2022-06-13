package com.cydeo.tests.day4_FindElementsCheckboxes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4FindElements {
    public static void main(String[] args) {
        //open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //Providing extra wait time for our driver before it throws NoSuchElementException
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Go to https://practice.cydeo.com/abtest
       driver.get(" https://practice.cydeo.com/abtest");
        //locate all the links in the page. Butun linkler a hargi tagName oldugu icin locator olarak
        //a kullanilmistir ve daha sonra kac tane a oldugunu bulmak icin size() method kullanilmali
       //List<WebElement> kullanirsam findElement kullanamam onun yerine cogulu ifade eden findElements
        // kullanmaliyim
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        //Print out the number of the links on the page
        System.out.println("allLinks = " + allLinks);
        //Print out the texts of the links

        for (WebElement each : allLinks) {//iter yazip tab basinca otomatik for each loop olusur
            // ya da allLinks.for enter ya da allLinks.iter enter basinca otomatik for each loop olusur
            System.out.println("text of link: "+each.getText());

        }
        //Print out the HREF value attribute values of the link
        for(WebElement each:allLinks){//List ismi.iter ya da list ismi.for dedigimizde otomatik
            // olarak for each olusmus olur.Yani allLink.iter enter dediginde for each olusmus olacak
            System.out.println("values of link: "+each.getAttribute("href"));
        }

        }


    }

