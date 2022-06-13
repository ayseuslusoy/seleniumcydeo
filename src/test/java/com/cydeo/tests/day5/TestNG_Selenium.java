package com.cydeo.tests.day5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;//It can be available everywhere
    @BeforeMethod//Beforemethod will be executed one time before each test. If I want to move my
    //  WebDriverManager.chromedriver().setup(); and  WebDriver driver=new ChromeDriver(); from
    //  @Test to @BeforeClass, I have to delete these things from @Test and shoul write
    //  WebDriverManager.chromedriver().setup() and driver=new ChromeDriver();This  means before
    //each @Test, @beforemethod will be exceuted and setup again. Ama burada da  WebDriver driver=new
    // ChromeDriver(); yazisindaki Webdriver silindigine dikkat et bunu @BeforeMethod dan once
    //@WebDriver driver; yazmalisin
            public void setup() {
        //Do browser driver setup
        WebDriverManager.chromedriver().setup(); //Bir tane utilities olusturup her defasinda bunu
        // yazmak yerine bu utilities deki class ismine de WebDriver Factory de ve WebDriverManager
        // .chromedriver().setup() ve  WebDriver driver=new ChromeDriver();yazmak yerine WebDriver
        // driver=WebDriverFactory.getDriver("chrome") yazabilirsin.Ama eger sen bunu test den before
        //method tasiyacaksan sadece driver=WebDriverFactory.getDriver("chrome") ve before methodunun
        //ustunede Webdriver driver; yazarsin
        //Open browser
        WebDriver driver = new ChromeDriver();
        //Maximize the page.@Test clean olmali maximize ve implicit wait de set up ile ilgili
        //oldugu icin @Test den @BeforeMethoda tasidim
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    @Test
    public void seleniumTest(){

        //Get "https://google.com"
        driver.get("https://google.com");
        //prevent google cookies
        WebElement agreeButton= driver.findElement(By.id("L2AGLb"));//Cookies cikmamasi icin
        // bu method yazilir
        agreeButton.click();//Cookies cikmamasi icin bu method yazilir
        //Assert title is google
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle);// Assert.assertEquals(actualTitle,expectedTitle,
        //"Title is not matching here"); String seklinde yazdigim title is not matching here eger equals
        //degeri false dondururse konsolda bu yaziyi gorurum. True ise gormem

    }
}
