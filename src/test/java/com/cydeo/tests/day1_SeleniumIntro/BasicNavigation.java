package com.cydeo.tests.day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        //set up the browser driver
        WebDriverManager.chromedriver().setup();
        //Create the instance of web driver (This is the line opening an empty browser)
        WebDriver driver = new ChromeDriver();
        //This line will maximize the browser size
        driver.manage().window().maximize();//fullscreen bazen windows icin ise yaramiyor o yuzden maximize
        // kullan
        //Go to "http:www.tesla.com"
        driver.get("http:www.tesla.com");//http silersen calismaz ama sadece www silersen calisir
        //driver.get(url) ve driver.navigate().to(url) ayni seydir
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.getTitle();//title in ne oldugunu consolda gozukmesini istersek println de getTitle da yazmaliyiz
        System.out.println("title"+driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//getCurrentUrl shows which
        //page I am in


    }

}
