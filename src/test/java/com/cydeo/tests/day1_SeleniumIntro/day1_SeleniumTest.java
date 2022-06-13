package com.cydeo.tests.day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_SeleniumTest {
    public static void main(String[] args) {
        //1.setup chrome driver
        WebDriverManager.chromedriver().setup();
        //2.Create WebDriver instance that point to chrome driver
        WebDriver driver=new ChromeDriver();
        //3.Navigate to the https://google.com
        driver.navigate().to("https://google.com");
        WebElement agreeButton= driver.findElement(By.id("L2AGLb"));//Cookies cikmamasi icin
        // bu method yazilir
        agreeButton.click();//Cookies cikmamasi icin bu method yazilir

        String pageTitle=driver.getTitle();//Sadede driver.getTitle() yazarsam print etmis olurum ama
        //onune String title da yazarsam ayni zamanda save etmis olurum
        System.out.println("pageTitle = " + pageTitle);
        if(pageTitle.equals("yahoo")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


    }
}